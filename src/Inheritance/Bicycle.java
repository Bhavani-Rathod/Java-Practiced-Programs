package Inheritance;

public class Bicycle {

    int gear;
    int speed;

    protected Bicycle(int gear, int startSpeed){
        this.gear = gear;
        this.speed = startSpeed;
    }

    public void setGear(int increment){
        gear += increment;
    }

    public void setSpeed(int decrement){
        speed -= decrement;
    }
}
