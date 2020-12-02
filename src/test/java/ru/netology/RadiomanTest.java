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
    public void shouldSetCurrentStationHigherMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(15);
        int actual = radioman.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(9);
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
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentStationMax() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(9);
        radioman.setPrevCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radioman radioman = new Radioman();
        radioman.setCurrentStation(0);
        radioman.setPrevCurrentStation();
        int actual = radioman.getCurrentStation();
        int expected = 9;

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
        radioman.setCurrentVolume(10);
        radioman.setIncreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 10;

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
        radioman.setCurrentVolume(10);
        radioman.setDecreaseCurrentVolume();
        int actual = radioman.getCurrentVolume();
        int expected = 9;

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