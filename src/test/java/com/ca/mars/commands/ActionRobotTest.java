package com.ca.mars.commands;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionRobotTest {

   @Test
   public void should_move_a_position() {
       assertEquals(ActionRobot.M, ActionRobot.indentifyCommand("M"));
   }

    @Test
    public void should_move_right(){
        assertEquals(ActionRobot.R, ActionRobot.indentifyCommand("R"));
    }

    @Test
    public void should_move_left(){
        assertEquals(ActionRobot.L, ActionRobot.indentifyCommand("L"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_return_an_illegal_argument_exception(){
        ActionRobot.indentifyCommand("A");
    }




}