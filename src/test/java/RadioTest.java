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
    public void shouldBeZeroWhenAboveNine() {
        Radio rad = new Radio();

        rad.currentRadioStation = 9;

        rad.setRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNineAnder() {
        Radio rad = new Radio();

        rad.setRadioStation(-1);

        int expected = 9;
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
    public void shouldBeOneHigher() {
        Radio rad = new Radio();

        rad.currentRadioVolume = 1;

        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeOneLower() {
        Radio rad = new Radio();

        rad.currentRadioVolume = 8;

        rad.decreaseVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeMaxVolume() {
        Radio rad = new Radio();

        rad.currentRadioVolume = 10;

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeMinVolume() {
        Radio rad = new Radio();

        rad.currentRadioVolume = 0;

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
