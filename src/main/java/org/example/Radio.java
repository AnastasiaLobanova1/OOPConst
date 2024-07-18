package org.example;

public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
    }

   public Radio(int amountStation) {
       this.maxStation = amountStation - 1;
       this.amountStation = maxStation;
   }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {

        int target = currentStation + 1;
        if (target > maxStation) {
            currentStation = minStation;
        } else {
            currentStation = target;
        }
    }

    public void prev() {
        int target = currentStation - 1;
        if (target < minStation) {
            currentStation = maxStation;
        } else {
            currentStation = target;
        }
    }

    public void setNumberStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
           return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void overMaxVolume() {
        int target = currentVolume + 1;
        if (target > maxVolume) {
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
