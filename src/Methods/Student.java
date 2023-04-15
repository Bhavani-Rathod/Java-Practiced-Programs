package Methods;

public class Student {

    private int studentNo(int i){
        i=i+1;
        return i;
    }

    public static void main(String[] args) {

        Student student = new Student();
        int rollNo =  student.studentNo(2);
        System.out.println(rollNo);
    }

}
