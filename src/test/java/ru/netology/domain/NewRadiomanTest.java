package ru.netology.domain;

import org.junit.jupiter.api.Test;
//import ru.netology.Radioman;

import static org.junit.jupiter.api.Assertions.*;

class NewRadiomanTest {
    @Test
    public void shouldSetCurrentStation() {
        NewRadioman newradioman = new NewRadioman();
        newradioman.setCurrentStation(5);
        int actual = newradioman.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    public void NewRadiomanCurrentStation () {
        NewRadioman newradioman = new NewRadioman(15, 4, 30);
        int actual = newradioman.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void NewRadiomanCurrentVolume () {
        NewRadioman newRadioman = new NewRadioman(15, 4, 30);
        int actual = newRadioman.getCurrentVolume();
        int expected = 30;
        assertEquals(expected, actual);
    }
//    @Test
//    public void shouldSetNextStationMax() {
//        NewRadioman newRadioman = new NewRadioman();
//        newRadioman.setCurrentStation(15);
//        newRadioman.setNexCurrentStation();
//        int actual = newRadioman.getCurrentStation();
//        int expected = 0;
//        assertEquals(expected, actual);
//    }

}