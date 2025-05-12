package DataStructure;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //Array

        String colors = new String("red,orange,yellow,green,blue,indigo,violet");
        System.out.println(Arrays.toString(colors.split(",")));

        //or
        String[] colors2 = new String[3];

        colors2[0] = "red";
        colors2[1] = "orange";
        colors2[2] = "yellow";

        System.out.println(Arrays.toString(colors2));

        //With for
        for(int i = 0; i < colors2.length; i++){
            System.out.println(colors2[i]);
        }
        System.out.println("\n");

        for(String color: colors.split(",")){
            System.out.println(color);
        }

        //System.out.println("\n");
        Arrays.stream(colors2).forEach(System.out::println);

    }
}
