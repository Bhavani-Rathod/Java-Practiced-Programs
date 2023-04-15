package Inheritance;

public class MotorCycle extends Bicycle{

    int setHeight;

    protected MotorCycle(int setHeight, int gear, int startSpeed){

        super(gear, startSpeed);
        this.setHeight = setHeight;
    }

    public void setHeight(int setValue){
        this.setHeight = setValue;
    }

    public void setGear(int increment){
        System.out.println("set gear" + increment);
    }

}
