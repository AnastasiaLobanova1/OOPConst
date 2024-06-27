package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {

        int target = currentStation + 1;
        if (target > 9) {
            currentStation = 0;
        } else {
            currentStation = target;
        }
    }

    public void prev() {
        int target = currentStation - 1;
        if (target < 0) {
            currentStation = 9;
        } else {
            currentStation = target;
        }
    }

    public void setNumberStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void overMaxVolume() {
        int target = currentVolume + 1;
        if (target > 10) {
            setCurrentVolume(target);
        } else {
            currentVolume = target;
        }


    }

    public void belowMinVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}
