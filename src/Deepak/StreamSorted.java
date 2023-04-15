package Deepak;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String[] args){

        List<String> nameList = new ArrayList<>();
        nameList.add("bhavani");
        nameList.add("anu");
        nameList.add("Sun");
        nameList.add("Deep");

        List<String> sortedList = nameList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }

}
