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
}