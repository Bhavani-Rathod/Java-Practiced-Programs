package Bhavani;

public class Student {

    String name;
    String address;
    int age;

    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){

        Student Bhavani = new Student("Bhavani", "Bhavani 123", 23);

        System.out.println(Bhavani.getName());
        System.out.println(Bhavani.getAddress());
        System.out.println(Bhavani.getAge());

        System.out.println(student(Bhavani).getName());

    }

    static Student student(Student deep){
        Student deepak = new Student("Deepak", deep.getAddress(), deep.getAge());
        return deepak;

    }

}
