import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldBeZeroAbove() {
        Radio rad = new Radio();

        rad.setRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldBeTwo() {
        Radio rad = new Radio();

        rad.setRadioStation(9);
        rad.setRadioStation(2);

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeSameAnder() {
        Radio rad = new Radio();

        rad.setRadioStation(2);
        rad.setRadioStation(-1);

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeSameAbove() {
        Radio rad = new Radio();

        rad.setRadioStation(7);
        rad.setRadioStation(10);

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeBigger10() {
        Radio rad = new Radio();

        rad.setVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeLower0() {
        Radio rad = new Radio();

        rad.setVolume(5);

        rad.setVolume(-2);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldBeOneHigher() {
        Radio rad = new Radio();

        rad.setVolume(1);

        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOneLower() {
        Radio rad = new Radio();

        rad.setVolume(8);

        rad.decreaseVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeMaxVolume() {
        Radio rad = new Radio();

        rad.setVolume(10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeMinVolume() {
        Radio rad = new Radio();

        rad.setVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldBeZeroWhenAboveNine() {
        Radio rad = new Radio();

        rad.setRadioStation(9);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldBeNineAnder() {
        Radio rad = new Radio();

        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnNextStationMax() {
        Radio rad = new Radio();

        rad.setRadioStation(8);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTurnNextStationMin() {
        Radio rad = new Radio();

        rad.setRadioStation(0);

        rad.prev();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTurnLastStationMin() {
        Radio rad = new Radio();

        rad.setRadioStation(1);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnLastStationMax() {
        Radio rad = new Radio();

        rad.setRadioStation(9);

        rad.next();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}
