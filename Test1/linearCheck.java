import java.util.Scanner;

public class linearCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // code here
        int[][] q = new int[n][2];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                q[i][j] = scn.nextInt();
            }
        }
        
        int check1 = q[0][0];
        int count1=1;
        for(int i=1;i<n;i++)
        {
            if(q[i][0]==check1)
            {
                count1++;
            }
        }
        
        int check2 = q[0][1];
        int count2=1;
        for(int i=1;i<n;i++)
        {
            if(q[i][1]==check2)
            {
                count2++;
            }
        }
        
        if(count1==n || count2==n)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}