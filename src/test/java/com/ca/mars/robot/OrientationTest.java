package com.ca.mars.robot;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrientationTest {

    @Test
    public void should_move_left_north() {
        assertEquals(Orientation.West, Orientation.moveLeft(Orientation.North));
    }

    @Test
    public void should_move_left_south() {
        assertEquals(Orientation.South, Orientation.moveLeft(Orientation.West));

    }

    @Test
    public void should_move_left_east() {
        assertEquals(Orientation.East, Orientation.moveLeft(Orientation.South));

    }

    @Test
    public void should_move_left_west() {
        assertEquals(Orientation.North, Orientation.moveLeft(Orientation.East));
    }

    @Test
    public void should_move_right_north() {
        assertEquals(Orientation.East, Orientation.moveRight(Orientation.North));
    }

    @Test
    public void should_move_right_south() {
        assertEquals(Orientation.West, Orientation.moveRight(Orientation.South));

    }

    @Test
    public void should_move_right_east() {
        assertEquals(Orientation.South, Orientation.moveRight(Orientation.East));

    }

    @Test
    public void should_move_right_west() {
        assertEquals(Orientation.North, Orientation.moveRight(Orientation.West));
    }

}