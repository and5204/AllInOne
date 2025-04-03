package com.example.allinoneraund2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.ThreadLocalRandom;

public class Apple {
    public static final int APPLESIZE = 20; // Recommended to make this constant
    private final Rectangle apple;

    private static final int MAX_X = SnakeApplication.WIDTH - APPLESIZE;
    private static final int MAX_Y = SnakeApplication.HEIGHT - APPLESIZE;

    // Constructor
    public Apple() {
        this.apple = createRandomApple();
        apple.setFill(Color.RED); // Set color immediately
    }

    private Rectangle createRandomApple() {
        int x = ThreadLocalRandom.current().nextInt(APPLESIZE, MAX_X);
        int y = ThreadLocalRandom.current().nextInt(APPLESIZE, MAX_Y);
        return new Rectangle(x, y, APPLESIZE, APPLESIZE);
    }

    public Rectangle getAppleShape() {
        return apple;
    }

    public void relocate() {
        apple.setX(ThreadLocalRandom.current().nextInt(APPLESIZE, MAX_X));
        apple.setY(ThreadLocalRandom.current().nextInt(APPLESIZE, MAX_Y));
    }
}
