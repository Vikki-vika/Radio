package ru.netology.radio;

public class Radio {
    private int currentStation; // номер станции 0-9
    private int currentVolume;  // уровень звука 0-100

    // Получение текущей станции
    public int getCurrentStation() {
        return currentStation;
    }

    // Установка текущей станции
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9){
            return;
        }
        this.currentStation = currentStation;
    }

    // Переключение на следующую станцию
    public void nextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    // Переключение на предыдущую станцию
    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation--;
        }
    }


    // Получение текущего уровня громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Установка громкости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100){
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Увеличение громкости на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшение громкости на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}