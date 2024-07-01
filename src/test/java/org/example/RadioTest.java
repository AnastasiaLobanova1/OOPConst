package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(10);

    @Test
    void shouldSetAmountStation() {

        Assertions.assertEquals(9, radio.getAmountStation());
    }


    @Test
    void shouldSetToOverUpperLimitStationByOne() {

        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldInitFieldsCurrentStation() {

        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldInitFieldsMinStation() {

        Assertions.assertEquals(0, radio.getMinStation());
    }
    @Test
    void shouldInitFieldsMaxStation() {

        Assertions.assertEquals(9, radio.getMaxStation());
    }
    @Test
    void shouldInitFieldsMaxVolume() {
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
    @Test
    void shouldInitFieldsMinVolume() {
        Assertions.assertEquals(0, radio.getMinVolume());
    }
    @Test
    void shouldInitFieldsCurrentVolume() {
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToBelowUpperLimitStationByOne() {

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetToUpperLimitStation() {

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetToLowerLimitStation() {

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void shouldSetToOverLowerLimitStationByOne() {

        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldSetToBelowLowerLimitStationByOne() {

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetToPositiveStation() {

        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetToNegativeStation() {

        radio.setCurrentStation(-5);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStationToLowerLimitStation() {

        radio.setCurrentStation(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStationToPositiveStation() {

        radio.setCurrentStation(1);
        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStationToUpperLimitStation() {

        radio.setCurrentStation(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStationToPositiveLimitStation() {

        radio.setCurrentStation(5);
        radio.next();

        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSetToNumberStation() {

        radio.setNumberStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetToOverUpperLimitVolumeByOne() {

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToBelowUpperLimitVolumeByOne() {

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToUpperLimitVolume() {

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToLowerLimitVolume() {

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToOverLowerLimitVolumeByOne() {

        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToBelowLowerLimitVolumeByOne() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetToPositiveVolume() {
        radio.setCurrentVolume(5);

        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test

    public void shouldSetToNegativeVolume() {
        radio.setCurrentVolume(-5);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowVolumeToMinVolume() {

        radio.setCurrentVolume(0);
        radio.belowMinVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldOverVolumeToMaxVolume() {

        radio.setCurrentVolume(100);
        radio.overMaxVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldPositiveVolume() {

        radio.setCurrentVolume(50);
        radio.overMaxVolume();

        Assertions.assertEquals(51, radio.getCurrentVolume());
    }
}
