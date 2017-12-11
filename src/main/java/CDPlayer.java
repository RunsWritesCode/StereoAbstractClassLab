public class CDPlayer extends Component {
    public CDPlayer(String model, String make, int volume) {
        super(model, make, volume);
    }

    public String play(String track){
        return track + " is playing";
    }

    public String pause(String track){
        return track + " is paused";

    }

    public String stop(String track){
        return track + " is stopped";
    }

    public String skip(){
        return "Track skipped";
    }
}
