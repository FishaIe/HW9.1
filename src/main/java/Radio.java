public class Radio {

    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int currentRadioVolume;

    public Radio(int maxRadioStation){
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(){
    }

    public int getCurrentStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentRadioVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setRadioStation(int newCurrentStation) {
        if (newCurrentStation < minRadioStation | newCurrentStation >= maxRadioStation) {
            return;
        }

        currentRadioStation = newCurrentStation;
    }

    public void next() {
        if (currentRadioStation == maxRadioStation - 1) {
            currentRadioStation = minRadioStation;
            return;
        }
        else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation - 1;
            return;
        }
        else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentRadioVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
        return;
    }


}
