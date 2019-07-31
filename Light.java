public class Light {
    boolean isOn;
    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }


    public static void main(String[] args) {
        Light red = new Light(); // create l1 object of Lamp class
        Light blue = new Light(); // create l2 object of Lamp class
    }
}