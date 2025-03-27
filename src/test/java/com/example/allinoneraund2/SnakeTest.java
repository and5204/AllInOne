package com.example.allinoneraund2;

import javafx.scene.shape.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {


    @Test
    public void testSnakeStartsEmpty() {
        Snake snake = new Snake();
        assertTrue("Тело змеи должно быть пустым изначально", snake.getBody().isEmpty());
    }

/*    @Test
    public Snake testAddFirstBlock() {
        Snake snake = new Snake();
        snake.addRectangleToSnake();
        assertEquals(1, snake.getBody().size());
        Rectangle firstBlock = snake.getBody().getFirst();
        assertEquals(0.0, firstBlock.getX(), 0.001);
        assertEquals(0.0, firstBlock.getY(), 0.001);
        assertEquals(3, firstBlock.getWidth());
        return snake;
    }*/
    @Test
    public void moveTest(){
        Snake snake = new Snake();
        assertThrows(IllegalArgumentException.class,() -> snake.move("null"));
        assertThrows(IllegalArgumentException.class,() -> snake.move(null));
    }

    @Test
    public void getBody() {

    }
}