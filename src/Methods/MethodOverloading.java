package Methods;

public class MethodOverloading {

    public int multiply(int x, int y){
        return (x*y);
    }

    public int multiply(int x, int y, int z){
        return (x*y*z);
    }

    public double multiply(double x, double y){
        return (x*y);
    }

    public static void main(String[] args) {

        MethodOverloading methOver = new MethodOverloading();
        System.out.println(methOver.multiply(2,3));
        System.out.println(methOver.multiply(2,3,4));
        System.out.println(methOver.multiply(2.0,3.0));

    }

}
