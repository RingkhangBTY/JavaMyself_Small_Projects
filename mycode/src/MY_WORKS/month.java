package MY_WORKS;
import java.util.*;

public class month {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number of month:");
    int no = sc.nextInt();
    switch (no) {
        case 1: System.out.println("january");
            break;
        case 2: System.out.println("February");
        break;
        case 3: System.out.println("March");
            break;
        case 4: System.out.println("April");
            break;
        case 5: System.out.println("May");
            break;
        case 6: System.out.println("June");
            break;
        case 7: System.out.println("July");
            break;
        case 8: System.out.println("Agust");
            break;
        case 9: System.out.println("September");
            break;
        case 10: System.out.println("October");
            break;
        case 11: System.out.println("November");
            break;
        case 12: System.out.println("December");
            break;
        default: System.out.println("Invelid!!!");
            break;
        }
    }
}
