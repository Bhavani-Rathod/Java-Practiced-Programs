package Deepak;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEg {

    public static void main(String[] args){

        List<String> languages = new ArrayList<>(4);
        languages.add("java");
        languages.add("python");
        languages.add("kotlin");

//        List<String> filterResult = new ArrayList<>(3);
//        for (String s : languages){
//
//            if (s.startsWith("p")) {
//                filterResult.add(s);
//            }
//        }
//        System.out.println(filterResult);

        List<String> filterResult = languages.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
        System.out.println(filterResult);

    }

}
