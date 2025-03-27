package com.example.allinoneraund2;

import javafx.scene.shape.Rectangle;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Rectangle> body = new LinkedList<>(); // All blocks
    private final int blockSize = 3; // Block size

    private String nowDirection = "NO"; // move direction, on start dont have direction

    // Adds a new block to the snake
    public void addRectangleToSnake() {
        if (body.isEmpty()) { // If we don't have a snake (used at startup)
            body.add(new Rectangle(0, 0, blockSize, blockSize)); // X, Y, width, height
        } else {
            Rectangle lastRectangle = body.getLast();
            // Add a new block at the same position as the last block
            body.add(new Rectangle(lastRectangle.getX(), lastRectangle.getY(), blockSize, blockSize));

        }
    }
    public void keyboardKovement(String direction){
        if(nowDirection != direction){ // if snake remove direction

        }
    }
    public void move(String direction){
        try {
            switch (direction) {
                case "LEFT":
                    keyboardKovement("LEFT");
                    break;
                case "RIGHT":
                    keyboardKovement("RIGHT");
                    break;
                case "UP":
                    keyboardKovement("UP");
                    break;
                case "DOWN":
                    keyboardKovement("DOWN");
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
