package NestedClasses;

public class OuterClass {

    static int numOfStudents = 10;
    int desks = 12;
    private static int numOfTeachers = 5;

    public static class StaticNestedClass{

        void college(){
            System.out.println("No. of students:" + numOfStudents);
            System.out.println("No. of teachers:" + numOfTeachers);
        }
    }

}
