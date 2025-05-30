package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        //Create a file

        try {
            File file = new File("C:/Users/Miller/IdeaProjects/RepasoJava/src/File/filename.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        //Escribir en un archivo

        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("File in Java");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }


        //Leer en un archivo

        try{
            File myFile = new File("filename.txt");
            Scanner myRead = new Scanner(myFile);
            while(myRead.hasNextLine()){
                String data = myRead.nextLine();
                System.out.println(data);
            }
            myRead.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        //Borrar un archivo
        File myFile = new File("filename.txt");
        if(myFile.delete()){
            System.out.println("Deleted the file: "+  myFile.getName());
        }else{
            System.out.println("Failed to delete the file");
        }

    }
}
