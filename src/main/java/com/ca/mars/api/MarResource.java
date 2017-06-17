package com.ca.mars.api;


import com.ca.mars.robot.Position;
import com.ca.mars.robot.Robot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest/mars")
public class MarResource {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    private final Robot robot;

    @Autowired
    public MarResource(Robot robot) {
        this.robot = robot;
    }

    @PostMapping(value = "/{commands}")
    public ResponseEntity<Position> toIdentifyRobotPosition(@PathVariable("commands") String commands) {
        logger.info("Starting the query of the coordinates of the robot!");
        return ResponseEntity.ok(robot.move(commands));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String, String> handleIllegalArgumentException(HttpServletRequest request, Exception ex) {
        logger.error("Command Invalid!");
        Map<String, String>  messages = new LinkedHashMap<>();
        messages.put("error",ex.getMessage());
        return messages;
    }

}
