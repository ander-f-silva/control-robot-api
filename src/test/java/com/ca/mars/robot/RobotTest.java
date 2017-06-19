package com.ca.mars.robot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    @Test
    public void must_move_right() {
        Robot robot = new Robot();

        Position position = robot.move("MMRMMRMM");

        assertEquals(2l,  position.getX());
        assertEquals(0l,  position.getY());
        assertEquals(Orientation.SOUTH.getInitials(),  position.getOrientation());
    }

    @Test
    public void must_move_left() {
        Robot robot = new Robot();

        Position position = robot.move("MML");

        assertEquals(0l,  position.getX());
        assertEquals(2l,  position.getY());
        assertEquals(Orientation.WEST.getInitials(),  position.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_invalidate_command() {
        Robot robot = new Robot();
        robot.move("AAA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_height_invalidate() {
        Robot robot = new Robot();
        robot.move("MMMMMMMMMMMMMMMMMMMMMMMM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_width_invalidate() {
        Robot robot = new Robot();
        robot.move("MRMMMMMMMMMMMMMMMMMMMMMMM");
    }
}
