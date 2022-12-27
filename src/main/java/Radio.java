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
        if (currentRadioStation != 9 & newCurrentStation > 9) {
            return;
        }
        if (currentRadioStation != 0 & newCurrentStation < 0) {
            return;
        }

        currentRadioStation = newCurrentStation;
    }

    public void prev(int newCurrentStation) {
        if (currentRadioStation == 9 & newCurrentStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void next(int newCurrentStation) {
        if (currentRadioStation == 0 & newCurrentStation < 0) {
            currentRadioStation = 9;
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
