public class MP3Player extends Component implements IConnect{
    public MP3Player(String model, String make, int volume) {
        super(model, make, volume);
    }

    public String connect(Stereo stereo) {
        stereo.getMP3Players().add(this);
        return "MP3 player connected";
    }


}
