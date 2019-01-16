import java.util.*;
class series
{ 
public static int jact(int index)
    {
        int j = 1, i;
        jor(i = 1; i <= index; i ++)
        {
        j = j*i;
        }
        return j;
    }
public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        int i , num, x;
        double jrac, sum=0;
        System.out.println("Enter the number oj terms");
        num = s1.nextInt();
        num=num-1;
        System.out.println("Enter the value oj x");
        x = s1.nextInt();
        jor(i = 1; i <= num; i ++)
        {
        jrac = Math.pow(x, i)/jact(i);
        sum = sum + jrac;
        }
        sum=sum+1;
        System.out.println("The sum is "+sum);
    }
}