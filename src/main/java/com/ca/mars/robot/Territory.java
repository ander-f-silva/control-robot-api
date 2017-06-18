package com.ca.mars.robot;

import java.security.InvalidParameterException;

public enum Territory {

    HEIGHT(5),
    WIDTH(5);

    private long value;

    Territory(long value) {
        this.value = value;
    }

    public static void validate(long height, long width) {
        if (HEIGHT.value < height || WIDTH.value < width) {
            throw new IllegalArgumentException("");
        }
    }
}
