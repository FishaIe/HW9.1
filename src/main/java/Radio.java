public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentRadioVolume;
    }

    public void setRadioStation(int newCurrentStation) {
        if (newCurrentStation < 0 | newCurrentStation > 9) {
            return;
        }

        currentRadioStation = newCurrentStation;
    }

    public void prev() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void next() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume > 10) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentRadioVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume += currentRadioVolume;
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
