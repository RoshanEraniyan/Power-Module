import java.util.*;


class Power
{
    public static int powermod(int a,int n,int m)
    {
        if(n==0)
        {
            return 1;
        }
        int p=powermod(a,n/2,m);
        if(n%2==0)
        {
            return (p*p)%m;
        }
        else
        {
            return (p*p*a)%m;
        }
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(powermod(a,n,m));
    }
}
