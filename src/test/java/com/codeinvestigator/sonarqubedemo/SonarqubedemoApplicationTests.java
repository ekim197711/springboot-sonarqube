package com.codeinvestigator.sonarqubedemo;

import com.codeinvestigator.sonarqubedemo.spaceship.AdvancedStatus;
import com.codeinvestigator.sonarqubedemo.spaceship.SpaceShipController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SonarqubedemoApplicationTests {

    @Autowired
    SpaceShipController spaceShipController;

    @Test
    @SuppressWarnings("squid:S2699")
    public void contextLoads() {
        AdvancedStatus result = spaceShipController.getStatus();
        Assertions.assertEquals("Fine we are floating in space", result);

    }

}
