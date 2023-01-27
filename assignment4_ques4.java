import java.util.Scanner;

public class assignment4_ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();
        int dupnum=num,duplicate=num;
        int countDigit=0;
        while(dupnum!=0)
        {
            dupnum/=10;
            countDigit++;
        }
        int sum=0;
        int digit;
        while(num!=0){
            digit=num%10;
            sum+=Math.pow( digit,countDigit);
            num/=10;
        }

        if(sum==duplicate)
            System.out.println("number is armstrong");
        else
            System.out.println("not");


        sc.close();
    }
}
