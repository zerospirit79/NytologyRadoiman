package ru.netology;

public class Radio {
//    Номер текущей (прослушиваемой) радиостанции
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > getMaxRadioStation()) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStation() {
        int newRadioStation = this.currentRadioStation++;
        setCurrentRadioStation(newRadioStation);
    }

    public int getMaxRadioStation() {
        return 9;
    }
//    Громкость звука
}
