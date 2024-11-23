package Homework;

public class pattern4 {
    public static void main(String[] args) {
        int n=4;

        // upper piramid 
        for(int i=1; i<=n; i++){
            for( int a=1; a<=n-i; a++){
            System.out.print("  ");
            }
            for(int b=1; b<=(i*2)-1; b++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower inverted piramid
        
        for(int i=n; i>=1; i--){
            for( int a=1; a<=n-i; a++){
            System.out.print("  ");
            }
            for(int b=1; b<=(i*2)-1; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}












