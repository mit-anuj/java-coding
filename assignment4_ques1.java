import java.util.Scanner;

public class assignment4_ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number: ");
        int num=sc.nextInt();
        int revnum=0;
        while(num!=0){
            revnum=revnum*10;
            revnum+=num%10;
            num=num/10;
        }

        System.out.println(revnum);

        sc.close();
    }
}
