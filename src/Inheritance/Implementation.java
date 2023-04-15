package Inheritance;

public class Implementation {

    public static void main(String[] args) {

        MotorCycle motorcycle = new MotorCycle(20, 10, 10);
        System.out.println(motorcycle.setHeight);

        motorcycle.setGear(5);
        System.out.println(motorcycle.gear);

        motorcycle.setSpeed(3);
        System.out.println(motorcycle.speed);

        motorcycle.setGear(3);

    }
}
