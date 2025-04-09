// Gmail = ringkhangb913@gmail.com then user_Name= ringkhangb913
package MY_WORKS;
import java.util.Scanner;

public class user_name{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = 10000;
        String user_data[]= new String[size];
        boolean res = true;
        int i=0;

        while (res){
            if(i>size){
                System.out.println("Not enough space in the array! ");
            }

            System.out.println("Enter user email's: ");
            String gmail= sc.nextLine();

            String username= print_user_name(gmail);
            user_data[i]= username;
            i++;

            System.out.println("Are u wanna to enter more gmail's ? (y/n)");
            String ans= sc.nextLine();
            if(ans.equalsIgnoreCase("n")){
                res=false;
            }
        }

        System.out.println("The user name's of given gmail's are: ");
        for(int j=0; j<i; j++){
            System.out.println(j +1+ ") " + user_data[j]);
        }
    }

    public static String print_user_name(String mail){

        StringBuilder UName= new StringBuilder();
        for(int i=0; i<mail.length(); i++){
            if(mail.charAt(i)=='@'){
                break;
            }else{
                UName.append(mail.charAt(i));
            }
        }
        return UName.toString();
    }                                                                                           
}