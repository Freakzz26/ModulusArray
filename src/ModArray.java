import java.util.Scanner;

public class ModArray {
    static void findMod(String arr[],int n,int b)
    {
        String result="";
        for(int i=0;i< arr.length;i++)
        {
            result=result+arr[i];
        }
        long number=Long.parseLong(result);
        long output=number%b;
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.next();
        }
        int b=scanner.nextInt();
        findMod(arr,n,b);
    }
}
