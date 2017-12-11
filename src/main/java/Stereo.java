import java.util.ArrayList;

public class Stereo extends Component {

    private Radio radio;
    private CDPlayer cdPlayer;
    private ArrayList<MP3Player> mp3Players;

    public Stereo(String model, String make, int volume, Radio radio, CDPlayer cdPlayer) {
        super(model, make, volume);

        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.mp3Players = new ArrayList<>();


    }

    public String tuneRadio(String radioStation) {
        return this.radio.tuneRadio(radioStation);
    }

    public String playCD(String track) {
        return this.cdPlayer.play(track);
    }

    public String pauseCD(String track) {
        return this.cdPlayer.pause(track);
    }
    public String stopCD(String track) {
        return this.cdPlayer.stop(track);
    }

    public String skipCD() {
        return this.cdPlayer.skip();
    }

    public ArrayList<MP3Player> getMP3Players(){
        return this.mp3Players;
    }

}
