package Nested_Class_Eg;

public class Implementation {

    public static void main(String[] args) {

        OuterClass.InnerClass innCls = new OuterClass().new InnerClass();
        innCls.student();

    }

}
