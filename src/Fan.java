public class Fan{
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius,String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        if (this.on){
            return this.getSpeed()+this.getColor()+this.getRadius()+"fan is on";
        }
        return this.getColor()+this.getRadius()+"fan is off";
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
    }
}


