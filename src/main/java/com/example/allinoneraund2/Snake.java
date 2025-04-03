package com.example.allinoneraund2;

import javafx.scene.shape.Rectangle;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Rectangle> body = new LinkedList<>(); // All blocks
    private final int BLOCKSIZE = 3; // Block size


    // Adds a new block to the snake
    public void addRectangleToSnake() {
        if (body.isEmpty()) { // If we don't have a snake (used at startup)
            body.add(new Rectangle(0, 0, BLOCKSIZE, BLOCKSIZE)); // X, Y, width, height
        } else {
            Rectangle lastRectangle = body.getLast();
            // Add a new block at the same position as the last block
            body.add(new Rectangle(lastRectangle.getX(), lastRectangle.getY(), BLOCKSIZE, BLOCKSIZE));

        }
    }
    public void keyboardKovement(int X, int Y){// remove last element and copy it, after add last element in start
        if(!body.isEmpty()) {
                Rectangle lastElement = body.removeLast();
                lastElement.setX(lastElement.getX()+X);
                lastElement.setY(lastElement.getY()+Y);
                body.addFirst(lastElement);
            }

    }
    public void move(String direction){
        try {
            switch (direction) {
                case "LEFT":
                    keyboardKovement(-BLOCKSIZE, 0);
                    break;
                case "RIGHT":
                    keyboardKovement(BLOCKSIZE, 0);
                    break;
                case "UP":
                    keyboardKovement(0, BLOCKSIZE);
                    break;
                case "DOWN":
                    keyboardKovement(0, -BLOCKSIZE);
                    break;
                default:
                    throw new IllegalArgumentException("error parameter");

            }
        }catch (Exception NullPointerException){
            throw new IllegalArgumentException("parameter is null");
        }

    }

    // Getter for testing purposes
    public LinkedList<Rectangle> getBody() {
        return body;
    }
}
