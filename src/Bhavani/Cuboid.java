package Bhavani;

public class Cuboid {

    int height;
    int weight;
    int width;

    public Cuboid(int height, int weight, int width){
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public  Cuboid(int height, int weight){
        this.height = height;
        this.weight = weight;
        this.width = 5;
    }

    public  Cuboid(int dimension){
        this.height = dimension;
        this.weight = dimension;
        this.width = dimension;
    }

    public Cuboid(){
        this.height = 10;
        this.weight = 10;
        this.width = 5;
    }

    int volume(){
        return height*weight*width;
    }

    public static void main(String[] args){
        int volume;

        Cuboid stdCuboid = new Cuboid(10,10,10);
        volume = stdCuboid.volume();
        System.out.println(volume);

        Cuboid CuboidDefaults = new Cuboid(10, 10);
        System.out.println(CuboidDefaults.volume());

        Cuboid Cube = new Cuboid(10);
        System.out.println(Cube.volume());

        Cuboid  defaultCuboid = new Cuboid();
        volume = defaultCuboid.volume();
        System.out.println(volume);

    }
}
