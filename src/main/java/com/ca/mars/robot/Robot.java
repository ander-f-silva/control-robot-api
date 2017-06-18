package com.ca.mars.robot;

import com.ca.mars.commands.ActionRobot;
import org.springframework.stereotype.Component;

@Component
public class Robot {

    public Position move(final String commands) {
        long total = commands.length();
        Position position = new Position();

        for (int i = 0; i < total; i ++)
            ActionRobot.indentifyCommand(String.valueOf(commands.charAt(i))).execute(position);

        return position;
    }


}
