import java.util.Scanner;

public class MAD_ANGLES {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star1 = n;
        int star2 = 2*n-1;
        int star3 = 1;
        int space = 0;
        
        for(int i = 0; i<n; i++){
            
            for(int j = 0; j<star1; j++){
                System.out.print("*");
            }    
            System.out.print("  ");
            
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            
            for(int j = 0; j<star2; j++){
                System.out.print("*");
            }
            System.out.print("  ");
            
            for(int j = 0; j<star3; j++){
                System.out.print("*");
            }
            System.out.print("  ");
            
            for(int j = 0; j<star2; j++){
                System.out.print("*");
            }
            
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            } 
            System.out.print("  ");
            
            for(int j = 0; j<star1; j++){
                System.out.print("*");
            }    
            
            System.out.println("");
            
            
            space+=1;
            star2-=2;
            star3+=2;
        }
        
    }
}