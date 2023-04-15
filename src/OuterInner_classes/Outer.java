package OuterInner_classes;

  class Outer {

    int totalStudents = 10;
    int desks = 8;
    int chairs = 3;

    void college(){

        System.out.println("Total no. of students:" + totalStudents);

        class InnerClass{

            int rollNo = 2;

            void student(){

                System.out.println("Student roll no:" + rollNo);
                System.out.println("Total desks:" + desks);
                System.out.println("Total chairs:" + chairs);
            }

        }
        InnerClass innCls = new InnerClass();
        innCls.student();

    }

    public static void main(String[] args) {

        Outer outCls = new Outer();
        outCls.college();

    }

}
