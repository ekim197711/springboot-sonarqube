package com.codeinvestigator.sonarqubedemo.spaceship;

import org.junit.jupiter.api.Test;

class SattelliteServiceTest {

    @Test
    void status() throws InterruptedException {
        SattelliteService sattelliteService = new SattelliteService();
        sattelliteService.status();
        Thread.sleep(1200);
        sattelliteService.status();
        Thread.sleep(200);
        sattelliteService.status();
        Thread.sleep(600);
        sattelliteService.status();
    }


    @Test
    void statusAwait() throws InterruptedException {
        SattelliteService sattelliteService = new SattelliteService();
        sattelliteService.statusWithAwait();
        Thread.sleep(1000);
        sattelliteService.statusWithAwait();
        Thread.sleep(400);
        sattelliteService.statusWithAwait();
        Thread.sleep(300);
        sattelliteService.statusWithAwait();
    }
}