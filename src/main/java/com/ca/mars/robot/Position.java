package com.ca.mars.robot;

public class Position {
    private long x;
    private long y;
    private Orientation orientation;

    public Position() {
        x = 0;
        y = 0;
        orientation = Orientation.North;
    }

    public void updateAxis() {
        switch (orientation) {
            case East:
                x++;
                break;
            case West:
                x--;
                break;
            case North:
                y++;
                break;
            case South:
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

    public String getOrientationInitial() {
        return orientation.getInitials();
    }
}
