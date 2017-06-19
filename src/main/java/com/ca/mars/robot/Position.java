package com.ca.mars.robot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    private long x;
    private long y;
    private Orientation orientation;

    public Position() {
        x = 0;
        y = 0;
        orientation = Orientation.NORTH;
    }

    public void updateAxis() {
        switch (orientation) {
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;
                break;
        }

        Territory.validate(y, x);
    }

    public void moveLeft() {
        orientation = Orientation.moveLeft(orientation);
    }

    public void moveRight() {
        orientation = Orientation.moveRight(orientation);
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    @JsonProperty("orientation")
    public String getOrientation() {
        return orientation.getInitials();
    }
}
