
public class Bird {
    private String name;
    private String nameLatin;
    private int observation;
    
    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }
    
    public void addObservation(String bird) {
        observation++;
    }
    
    public String getName() {
        return name;
    }

    
    @Override
    public String toString() {
        return name + " (" + nameLatin + "): " + observation + " observations";
    }
}
