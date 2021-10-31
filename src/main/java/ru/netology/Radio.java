package ru.netology;

public class Radio {
    //    Номер текущей (прослушиваемой) радиостанции
    private int currentRadioStation;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadio) {
            return;
        }
        if (currentRadioStation > maxRadio) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation == maxRadio) {
            currentRadioStation = minRadio;
            return;
        }
        this.currentRadioStation += 1;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation == minRadio) {
            currentRadioStation = maxRadio;
            return;
        }
        this.currentRadioStation -= 1;
    }
//    Громкость звука

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume -= 1;
    }
}
