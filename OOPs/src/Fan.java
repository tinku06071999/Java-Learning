public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn = false;
    private double speed = 0;

    public Fan(){
        this.isOn = false;
        this.speed = 0;
    }
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    public void switchOn(){
        isOn = true;
        System.out.println("Fan On");
    }
    public void switchOff(){
        System.out.println("Fan Off");
    }
    public void changeSpeed(){
        speed = 2;
        System.out.println("Speed changes");
    }
    public String toString(){
       return ("Make: " + make + '\n' +
                           "radius: " + radius + '\n' +
                          "color: " + color + '\n' +
                           "isOn: "+ isOn + '\n');
    }
}
