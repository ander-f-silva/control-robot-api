package com.ca.mars.commands;

import com.ca.mars.robot.Position;

public enum ActionRobot {
    M(p -> p.updateAxis()),
    L(p -> p.moveLeft()),
    R(p -> p.moveRight());

    private Commands commands;

    ActionRobot(Commands commands) {
        this.commands = commands;
    }

    public void execute(Position position) {
        commands.execute(position);
    }

   public static ActionRobot indentifyCommand(String command) throws IllegalArgumentException {
        for (ActionRobot action : ActionRobot.values()) {
            if (action.name().equals(command)) {
                return action;
            }
        }
                
        throw new IllegalArgumentException("There is no " + command + " command!");
    }
}
