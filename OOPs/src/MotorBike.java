public class MotorBike {
    private String model;
    private double speed;
    private int gears;

    public MotorBike(String model, double speed, int gears) {
        this.model = model;
        this.speed = speed;
        this.gears = gears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
    public void start(){
        System.out.println(getModel() + " Started!!!");
    }
}
