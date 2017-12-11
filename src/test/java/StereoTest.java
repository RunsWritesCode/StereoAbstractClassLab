import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Radio radio;
    CDPlayer cdPlayer;
    Stereo stereo;
    MP3Player mp3Player;

    @Before
    public void before() {

        radio = new Radio("Supersonic", "Sony", 11);
        cdPlayer = new CDPlayer("MegaCSDGSGAWEsg", "Apple", 5);
        stereo = new Stereo("Fire", "Samsung", 11, radio, cdPlayer);
        mp3Player = new MP3Player("FrogDog", "Terry Pratchett", 7);

    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canSetVolume() {
        radio.setVolume(1);
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Let it be is playing", cdPlayer.play("Let it be"));
    }

    @Test
    public void canSkipSong(){
        assertEquals("Track skipped", cdPlayer.skip());
    }

    @Test
    public void tuneRadio() {
        assertEquals("Motorcycle Emptiness is playing.", stereo.tuneRadio("Motorcycle Emptiness"));
    }

    @Test
    public void canConnectMP3Player(){
        assertEquals("MP3 player connected", mp3Player.connect(stereo));
        assertEquals(1, stereo.getMP3Players().size());
    }
}
