package Java.Interface;

public class Circuit {

    private int angle;
    private String name;

    Circuit(int angle, String name) {
        this.angle = angle;
        this.name = name;
    }

    public int getAngle() {
        return angle;
    }
}
