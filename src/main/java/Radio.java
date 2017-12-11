public class Radio extends Component {


    public Radio(String model, String make, int volume) {
        super(model, make, volume);
    }

    public String tuneRadio(String radioStation) {

        return radioStation + " is playing.";

    }


}
