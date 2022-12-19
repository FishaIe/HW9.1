public class Radio {
    public int currentRadioStation;
    public int currentRadioVolume;

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
        if (currentRadioStation == 0 & newCurrentStation < 0) {
            currentRadioStation = 9;
            return;
        }
        if (currentRadioStation == 9 & newCurrentStation > 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation = newCurrentStation;
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
