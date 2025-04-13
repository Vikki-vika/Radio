package ru.netology.radio;

public class Radio {
    private int currentStation; // Текущая радиостанция
    private int numberOfStations; // Количество радиостанций
    private int volume;          // Уровень громкости звука

    public Radio() {
        this.numberOfStations = 10;
        this.currentStation = 0;
        this.volume = 0; // По умолчанию громкость 0
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStation = 0;
        this.volume = 0; // По умолчанию громкость 0
    }

    // Получение текущей станции
    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }


    // Установка текущей станции
    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < numberOfStations) {
            this.currentStation = currentStation;
        }
    }


    // Переключение на следующую станцию
    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Переключение на предыдущую станцию
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }


    // Получение текущего уровня громкости
    public int getVolume() {
        return volume;
    }

    // Установка громкости
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    // Увеличение громкости на 1
    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    // Уменьшение громкости на 1
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}