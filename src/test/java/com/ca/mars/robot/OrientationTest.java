package com.ca.mars.robot;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrientationTest {

    @Test
    public void should_move_left_north() {
        assertEquals(Orientation.WEST, Orientation.moveLeft(Orientation.NORTH));
    }

    @Test
    public void should_move_left_south() {
        assertEquals(Orientation.SOUTH, Orientation.moveLeft(Orientation.WEST));

    }

    @Test
    public void should_move_left_east() {
        assertEquals(Orientation.EAST, Orientation.moveLeft(Orientation.SOUTH));

    }

    @Test
    public void should_move_left_west() {
        assertEquals(Orientation.NORTH, Orientation.moveLeft(Orientation.EAST));
    }

    @Test
    public void should_move_right_north() {
        assertEquals(Orientation.EAST, Orientation.moveRight(Orientation.NORTH));
    }

    @Test
    public void should_move_right_south() {
        assertEquals(Orientation.WEST, Orientation.moveRight(Orientation.SOUTH));

    }

    @Test
    public void should_move_right_east() {
        assertEquals(Orientation.SOUTH, Orientation.moveRight(Orientation.EAST));

    }

    @Test
    public void should_move_right_west() {
        assertEquals(Orientation.NORTH, Orientation.moveRight(Orientation.WEST));
    }

}