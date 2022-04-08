package com.rohanchallenges;
import com.rohanchallenges.ds.*;
import com.rohanchallenges.ll.*;
import com.rohanchallenges.calc.*;
import com.rohanchallenges.sorts.*;

import java.util.Scanner;

public class Menu {

    public static void menu() {


        int selection;  //user selection variable of type Integer

        //Using a Class: AP CSA Unit 2
        //Scanner is well known Java class for text based input
        Scanner scan = new Scanner(System.in);  //defining an object to scan/get input from user, notice the use of "new", this means you are making an object of type Scanner.

        //System.out.println -  A Class or Static method call that is used to output a message to the terminal.
        //The block of outputs below is used to present a menu to the user.
        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - IntByReference");
        System.out.println("2 - Matrix");
        System.out.println("3 - Calculator");
        System.out.println("4 - Sorts");
        System.out.println("0 - Quit");

        //Using Scanner Class to get integer as input
        selection = scan.nextInt();  //Using nextInt() method to get an integer value



        switch (selection) {
            case 0:
                return;
            case 1:
                System.out.println("Choose 1st number:");
                int n1 = scan.nextInt();
                System.out.println("Choose 2nd number:");
                int n2 = scan.nextInt();
                IntByReference.swapper(n1, n2);
                break;
            case 2:
                Matrix m0 = new Matrix(Matrix.keypad());
                System.out.println("Keypad:");
                System.out.println(m0);

                Matrix m1 = new Matrix(Matrix.numbers());
                System.out.println("Numbers Systems:");
                System.out.println(m1);
                break;
            case 3:
                ArrayStackDemo result = new ArrayStackDemo();
                System.out.print(result);
                break;
            case 4:
                break;
            default:
                System.out.println("Unexpected choice, try again.");
        }
        menu();


    }

    public static void main(String[] args){
        Menu.menu();
    }

}