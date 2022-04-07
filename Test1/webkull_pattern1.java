import java.util.Scanner;

public class webkull_pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // code here
        
            for(int row=0;row<n+2;row++)
            {
                if(row==0)
                {
                    for(int i=0;i<n;i++)
                    {
                        System.out.print("@");
                    }
                    
                }
                if(row>=1 && row<(n+2)/2 )
                {
                  for(int i=0;i<n-1;i++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<row;j++)
                    {
                        System.out.print("*");
                    }
                }
                if(row==(n+2)/2)
                {
                    for(int i=0;i<n-1;i++)
                    {
                        System.out.print(" ");
                    }
                    for(int i=0;i<n/2+1;i++)
                    {
                        System.out.print("*");
                    }
                }
                
                if(row==n+2-1)
                {
                    for(int i=0;i<n-2;i++)
                    {
                        System.out.print(" ");
                    }
                    for(int i=0;i<n;i++)
                    {
                        System.out.print("@");
                    }
                }
                
                if(row>(n+2)/2 && row<n+2-1)
                {
                    for(int i=0;i<n-1;i++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=n+1-row;j>=1;j--)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        
        
    }
}