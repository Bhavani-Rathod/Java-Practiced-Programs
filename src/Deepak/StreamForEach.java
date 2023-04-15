package Deepak;

import java.util.ArrayList;
import java.util.List;

public class StreamForEach {

    public static void main(String[] args){

        List<String> namesList = new ArrayList<>(5);
        namesList.add("bhav");
        namesList.add("deep");
        namesList.add("sunn");
        namesList.add("rathod");

        namesList.stream().forEach(s -> System.out.println("Each element is:" + s));

    }

}
