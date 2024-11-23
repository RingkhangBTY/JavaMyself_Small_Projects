package my;
import java.util.*;

public class calculator {
    public static void main(String[] srgs){
    Scanner sc = new Scanner(System.in);
    System.out.println("-----Welcome to CALCULATOR-----");
    String input;
    do{
    System.out.println("   Enter first no: ");
    int a = sc.nextInt();
        System.out.println("   Enter second no: ");
        int b = sc.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo/Remainder");
    System.out.println("Enter your choice:");
    int choic=sc.nextInt();

    switch (choic) {
        case 1 : System.out.println("Addition of "+a+" and "+b+" is:"+a+b);
            break;
        case 2 : if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
            break;
        case 3 : System.out.println(a*b);
            break;
        case 4 : if(b==0){
            System.out.println("You cant divide by 0.");
        }
        else{
            System.out.println(a/b);
        }
            break;
        case 5 : if(b==0){
            System.out.println("Invalid division! ");
        }
        else{
         System.out.println(a%b);
        }
            break;
        default: System.out.println("Invalid");
            break;
    }
    System.out.println("If you want to continue press Y :");
    input = sc.next();
}while(input.equals("y"));
   }    
}