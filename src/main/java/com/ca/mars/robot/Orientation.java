package com.ca.mars.robot;

public enum Orientation {

    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String initials;

    Orientation(String initials) {
        this.initials = initials;
    }

    public String getInitials() {
        return initials;
    }

    public static Orientation moveLeft(Orientation orientation) {
        switch (orientation) {
            case NORTH:
                return Orientation.WEST;
            case WEST:
                return Orientation.SOUTH;
            case SOUTH:
                return Orientation.EAST;
            default:
                return Orientation.NORTH;
        }
    }

    public static Orientation moveRight(Orientation orientation) {
        switch (orientation) {
            case NORTH:
                return Orientation.EAST;
            case EAST:
                return Orientation.SOUTH;
            case SOUTH:
                return Orientation.WEST;
           default:
                return Orientation.NORTH;
        }
    }

}
