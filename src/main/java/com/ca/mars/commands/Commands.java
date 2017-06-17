package com.ca.mars.commands;

import com.ca.mars.robot.Position;

@FunctionalInterface
interface Commands {
    void execute(Position position);
}
