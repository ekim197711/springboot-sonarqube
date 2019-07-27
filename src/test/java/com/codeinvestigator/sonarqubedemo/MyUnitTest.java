package com.codeinvestigator.sonarqubedemo;

import com.codeinvestigator.sonarqubedemo.spaceship.AdvancedStatus;
import com.codeinvestigator.sonarqubedemo.spaceship.SpaceShipController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyUnitTest {

    @Test
    public void myTest(){
        AdvancedStatus s = new SpaceShipController().getStatus();
        Assertions.assertNotNull(s);
    }

}
