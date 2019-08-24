package PatronesCreacionales.SimpleFactory;

public class Pizza {
    private int NumberSlices;

    public Pizza (int NumberSlices) {
        this.NumberSlices = NumberSlices;
    }

    @Override
    public String toString() {
        return "The pizza has " + this.NumberSlices + " slices";
    }
}
