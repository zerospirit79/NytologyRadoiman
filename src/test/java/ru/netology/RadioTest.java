package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void positiveRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int actual = radio.getCurrentRadioStation();
        int expect = 5;
        assertEquals(expect, actual);
    }

    @Test
    void zeroRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int actual = radio.getCurrentRadioStation();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void negativeRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStation();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void overRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void increasePositiveRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expect = 6;
        assertEquals(expect, actual);
    }

    @Test
    void increaseNegativeRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void decreasePositiveRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void decreaseNegativeRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int actual = radio.getCurrentRadioStation();
        int expect = 9;
        assertEquals(expect, actual);
    }
    //volume
    @Test
    void positiveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expect = 5;
        assertEquals(expect, actual);
    }

    @Test
    void zeroRadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void negativeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void overVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expect = 10;
        assertEquals(expect, actual);
    }

    @Test
    void increasePositiveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expect = 6;
        assertEquals(expect, actual);
    }

    @Test
    void increaseNegativeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expect = 10;
        assertEquals(expect, actual);
    }

    @Test
    void decreasePositiveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void decreaseNegativeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expect = 0;
        assertEquals(expect, actual);
    }
}