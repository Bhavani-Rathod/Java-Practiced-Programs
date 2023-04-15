package Deepak;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args){

        List<Integer> numberList = new ArrayList<>(5);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(4);

        int sum = numberList.stream().reduce(0, (ans, i) -> ans+i);

        System.out.println("sum of numbers in the numberList:" + sum);

    }

}
