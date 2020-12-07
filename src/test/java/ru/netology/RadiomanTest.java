package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    @Test
    public void shouldSetCurrentStation() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(5);
        int actual = radioman.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }


    @Test
        public void RadiomanCurrentStation () {
            Radioman radioman = new Radioman(15, 4, 30);
            int actual = radioman.getCurrentStation();
            int expected = 4;
            assertEquals(expected, actual);
        }
    @Test
    public void RadiomanMaxStation () {
        Radioman radioman = new Radioman(15, 4, 30);
        int actual = radioman.getMaxStation();
        int expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    public void RadiomanCurrentVolume () {
        Radioman radioman = new Radioman(15, 4, 30);
        int actual = radioman.getCurrentVolume();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationHigherMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(16);
        int actual = radioman.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(15);
        radioman.setNexCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax1() {
        Radioman radioman = new Radioman(15, 15, 30);
        radioman.setNexCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(0);
        radioman.setNexCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationLowerMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(-5);
        int actual = radioman.getCurrentStation();
        int expected = 15;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentStationMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(15);
        radioman.setPrevCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 14;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(0);
        radioman.setPrevCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 15;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(5);
        int actual = radioman.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseCurrentVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(100);
        radioman.setIncreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseCurrentVolumeMax1() {
        Radioman radioman = new Radioman(15, 10, 90);
        //radioman.setCurrentVolume(100);
        radioman.setIncreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 91;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseCurrentVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(0);

        radioman.setIncreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(0);
        radioman.setDecreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(100);
        radioman.setDecreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolume() {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(5);
        radioman.setDecreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }


}