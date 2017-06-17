package com.ca.mars.robot;

public enum Orientation {

    North("N"),
    South("S"),
    East("E"),
    West("W");

    private String initials;

    Orientation(String initials) {
        this.initials = initials;
    }

    public String getInitials() {
        return initials;
    }

    public static Orientation moveLeft(Orientation orientation) {
        switch (orientation) {
            case North:
                return Orientation.West;
            case West:
                return Orientation.South;
            case South:
                return Orientation.East;
            default:
                return Orientation.North;
        }
    }

    public static Orientation moveRight(Orientation orientation) {
        switch (orientation) {
            case North:
                return Orientation.East;
            case East:
                return Orientation.South;
            case South:
                return Orientation.West;
           default:
                return Orientation.North;
        }
    }

}
