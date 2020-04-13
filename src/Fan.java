public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed ;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getStatus(){
        return this.on;
    }
    public void turn(){
        this.on = !this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public  Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void ToString(){
        if (this.on){
            System.out.println("Quạt đang bật: ");
            System.out.println("Tốc độ quạt: " + this.speed);
            System.out.println("Bán kính quay: " + this.radius);
            System.out.println("Màu của quạt: " + this.color);
        }else {
            System.out.println("Quạt đang tắt");
        }
    }
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(2);
        System.out.println(fan.getSpeed());
        fan.turn();
        fan.ToString();
    }
}
