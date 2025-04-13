package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void shouldCreateRadioWithDefaultStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getNumberOfStations());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCreateRadioWithCustomStations() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getNumberOfStations());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToFirstStationIfNextIsLast() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToLastStationIfPreviousIsFirst() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();
        Assertions.assertEquals(9, radio.getVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldNotSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        Assertions.assertEquals(0, radio.getVolume());
        radio.setVolume(101);
        Assertions.assertEquals(0, radio.getVolume()); // Исправлено с 100 на 0
    }
}