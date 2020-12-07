package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NewRadioman {
    private int minStation = 0;
    private int maxStation = 15;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public NewRadioman(int maxStation, int currentStation, int currentVolume) {

        this.maxStation = maxStation;
        this.currentStation = currentStation;

        this.currentVolume = currentVolume;
    }


}
