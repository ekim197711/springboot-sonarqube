package com.codeinvestigator.sonarqubedemo.spaceship;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvancedStatus {
    private Long crew;
    private Integer temperature;
    private Integer pressure;
    private String nameOfShip;
}
