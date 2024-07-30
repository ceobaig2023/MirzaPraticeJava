/*
package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public int a;
    public void CheckedEx2(){
        try {

            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Reading first line of the file
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e);
        }
    }
    }


    public void UnCheckE(){

        try {

            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        }


    }



    public static void main(String[] args) {
        PCheckedException o123=new PCheckedException();
        o123.CheckedE();

        CheckedException a123=new CheckedException();
        a123.UnCheckE();

        a123.CheckedEx2();



    }
}

*/
