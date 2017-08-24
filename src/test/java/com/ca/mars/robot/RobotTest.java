package com.ca.mars.robot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    @Test
    public void mustMoveRight() {
        Robot robot = new Robot();

        Position position = robot.move("MMRMMRMM");

        assertEquals(2l,  position.getX());
        assertEquals(0l,  position.getY());
        assertEquals(Orientation.SOUTH.getInitials(),  position.getOrientation());
    }

    @Test
    public void mustMoveLeft() {
        Robot robot = new Robot();

        Position position = robot.move("MML");

        assertEquals(0l,  position.getX());
        assertEquals(2l,  position.getY());
        assertEquals(Orientation.WEST.getInitials(),  position.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldInvalidateCommand() {
        Robot robot = new Robot();
        robot.move("AAA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHeightInvalidate() {
        Robot robot = new Robot();
        robot.move("MMMMMMMMMMMMMMMMMMMMMMMM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldWidthInvalidate() {
        Robot robot = new Robot();
        robot.move("MRMMMMMMMMMMMMMMMMMMMMMMM");
    }
}
