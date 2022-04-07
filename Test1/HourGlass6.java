import java.util.*;
public class HourGlass6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int stars=n;
        int spaces=0;
        int rows=1;
        while(rows<=n)
        {
            for(int i=1;i<=spaces;i++)
            {
                System.out.print("\t");
            }

            for(int j=1;j<=stars;j++)
            {
                if(rows>1 && rows<n/2+1 && j>1 && j<stars)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }

            if(rows<n/2+1)
            {
                stars-=2;
                spaces+=1;
            }
            else{
                stars+=2;
                spaces-=1;
            }

            System.out.println();
            rows++;
        }

    }
}