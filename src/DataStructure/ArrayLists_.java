package DataStructure;

import java.util.List;
import java.util.ArrayList;

public class ArrayLists_ {

    public static void main(String[] args) {
        //List and ArrayList
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("red");

        List<String> colors2 = new ArrayList<>();
        colors2.add("blue");
        colors2.add("red");

        for (String color: colors2) {
            System.out.println(color);
        }

    }
}
