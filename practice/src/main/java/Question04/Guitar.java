package Question04;

public class Guitar extends Instrument implements Playable {
    
    public Guitar() {
        this.name = "Guitar";
    }

    @Override
    void tune() {
        System.out.println(name + " is being tuned to the correct pitch.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing a beautiful melody.");
    }
}