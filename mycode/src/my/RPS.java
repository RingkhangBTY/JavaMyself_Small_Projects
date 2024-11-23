package my;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        System.out.println("------Welcome to stone-Paper-Scissor------");
        boolean choice=true;
        while (choice){
            System.out.println("Enter '0' for stone, '1' for paper and '2' for scissor.");
            Scanner sc= new Scanner(System.in);
            int ch= sc.nextInt();
            Random rand = new Random();
            int rn=rand.nextInt(3);
            if(ch>2){
                System.out.println("Wrong choice!!___Try again...");
            }
            else {
                if (ch == 0 && rn == 2 || ch == 1 && rn == 0 || ch == 2 && rn == 1) {
                    System.out.println("you win...");
                } else if (ch == rn) {
                    System.out.println("Draw both are choice same option...");
                } else {
                    System.out.println("Computer wins! You lose!!");
                    System.out.println("Try again! better luck next time...");
                }
                System.out.println("Computer choice is:" + rn);
            }
            sc.nextLine();
            System.out.println("To continue playing press any k1" +
                    "ey and To exit type 'exit'.");
            String con=sc.nextLine();
            if(con.equals("exit")){
                choice=false;
                System.out.println("\n--------------Thank you for playing--------------\n");
            }
        }
    }
}