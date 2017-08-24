package com.ca.mars.commands;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionRobotTest {

   @Test
   public void shouldMoveAPosition() {
       assertEquals(ActionRobot.M, ActionRobot.indentifyCommand("M"));
   }

    @Test
    public void shouldMoveRight(){
        assertEquals(ActionRobot.R, ActionRobot.indentifyCommand("R"));
    }

    @Test
    public void shouldMoveLeft(){
        assertEquals(ActionRobot.L, ActionRobot.indentifyCommand("L"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnAnIllegalArgumentException(){
        ActionRobot.indentifyCommand("A");
    }

}