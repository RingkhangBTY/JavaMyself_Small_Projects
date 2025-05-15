
package Homework;
import java.util.*;
public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        do{
            System.out.println("Enter your marks out of 100:");
            int mark = sc.nextInt();
            if(mark >= 90 && mark<=100){
                System.out.println("This is good");
            }
            else if(mark >= 60 && mark<=89){
                System.out.println("this is also good");
            }
            else if (mark >=0 && mark<=59){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Invelid input");
            }
            System.out.println("Do you whant to continue : (y/n)");
            x = sc.next();
        }while(x.equals("y"));
    }
}
