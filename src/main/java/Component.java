public abstract class Component {

    private String model;
    private String make;
    private int volume;

    public Component(String model, String make, int volume) {
        this.model = model;
        this.make = make;
        this.volume = volume;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



}
