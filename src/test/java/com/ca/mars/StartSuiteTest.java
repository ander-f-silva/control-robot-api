package com.ca.mars;


import com.ca.mars.commands.ActionRobotTest;
import com.ca.mars.robot.OrientationTest;
import com.ca.mars.robot.RobotTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ActionRobotTest.class,
        OrientationTest.class,
        RobotTest.class
})
public class StartSuiteTest {
}
