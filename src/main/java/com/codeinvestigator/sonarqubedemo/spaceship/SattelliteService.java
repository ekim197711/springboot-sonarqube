package com.codeinvestigator.sonarqubedemo.spaceship;

import lombok.extern.slf4j.Slf4j;
import org.awaitility.Awaitility;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

@Service
@Slf4j
public class SattelliteService {

    LocalDateTime lastUsed = LocalDateTime.now();

    public String status() {
        log.info("status: BEGIN");

        long diff = Duration.between(lastUsed, LocalDateTime.now()).toMillis();
        long timeToWait = Math.max(0, 3000 - diff);
        log.info("diff: {}, wait: {}", diff, timeToWait);
        try {
            Thread.sleep(timeToWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simulate call to 3rd party
        log.info("status: Calling 3rdParty");
        String resultFrom3rdParty =  "Everything is fine...";


        lastUsed = LocalDateTime.now();
        log.info("status: END");

        return resultFrom3rdParty;
    }

    private boolean isReady(){
        long diff = Duration.between(lastUsed, LocalDateTime.now()).toMillis();
        long timeToWait = Math.max(0, 3000 - diff);
        boolean b = timeToWait <= 0;
        log.info("statusWithAwait: IsReady! {}", b);
        return b;
    }

    public String statusWithAwait(){
        log.info("statusWithAwait: BEGIN");

        Awaitility.setDefaultTimeout(12000, TimeUnit.MILLISECONDS);
        Awaitility.setDefaultPollInterval(100, TimeUnit.MILLISECONDS);
        Awaitility.setDefaultPollDelay(1000, TimeUnit.MILLISECONDS);

        await().until(this::isReady);

        // Simulate call to 3rd party
        log.info("statusWithAwait: Calling 3rdParty");
        String resultFrom3rdParty =  "Everything is fine from await lib...";


        lastUsed = LocalDateTime.now();
        log.info("statusWithAwait: END");

        return resultFrom3rdParty;
    }


}
