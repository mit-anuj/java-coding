import java.util.Scanner;

// sum of series 1+1/2+...+1/n.

public class assignment4_ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        float sum=0,div;
        for(float i=1;i<=n;i++){
            div=(float)(1/i);
            sum=sum+div;
        }

        System.out.println("sum is : " + sum);

        sc.close();
    }
}
