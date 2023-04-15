package Bhavani;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

//        List<Integer> squareList = new ArrayList<>();
//        for (int i : numberList){
//            squareList.add(i*i);
//        }
//
//        System.out.println(squareList);

        List<Integer> squareList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(squareList);
    }

}
