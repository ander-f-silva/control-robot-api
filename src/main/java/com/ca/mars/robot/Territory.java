package com.ca.mars.robot;

public class Territory {

   private long height = 5;
   private long width = 5;

    public Territory() {
    }

    public Territory(long height, long width) {
        this.height = height;
        this.width = width;
    }

    public void validate(long height, long width) {
        if (this.height < height || this.width < width) {
            throw new IllegalArgumentException("Number of commands exceeded limit allowed!");
        }
    }
}
