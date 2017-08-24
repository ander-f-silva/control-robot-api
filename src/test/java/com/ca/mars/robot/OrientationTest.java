package com.ca.mars.robot;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrientationTest {

    @Test
    public void shouldMoveLeftNorth() {
        assertEquals(Orientation.WEST, Orientation.moveLeft(Orientation.NORTH));
    }

    @Test
    public void shouldMoveLeftSouth() {
        assertEquals(Orientation.SOUTH, Orientation.moveLeft(Orientation.WEST));
    }

    @Test
    public void shouldMoveLeftEast() {
        assertEquals(Orientation.EAST, Orientation.moveLeft(Orientation.SOUTH));
    }

    @Test
    public void shouldMoveLeftWest() {
        assertEquals(Orientation.NORTH, Orientation.moveLeft(Orientation.EAST));
    }

    @Test
    public void shouldMoveRightNorth() {
        assertEquals(Orientation.EAST, Orientation.moveRight(Orientation.NORTH));
    }

    @Test
    public void shouldMoveRightSouth() {
        assertEquals(Orientation.WEST, Orientation.moveRight(Orientation.SOUTH));
    }

    @Test
    public void shouldMoveRightEast() {
        assertEquals(Orientation.SOUTH, Orientation.moveRight(Orientation.EAST));
    }

    @Test
    public void shouldMoveRightWest() {
        assertEquals(Orientation.NORTH, Orientation.moveRight(Orientation.WEST));
    }

}