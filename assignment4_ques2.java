import java.util.Scanner;

public class assignment4_ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number: ");
        int num=sc.nextInt();

        int count=1;
        int digit;
        int sumeven=0,sumodd=0;

        int numberOfDigits=0;

        int dupnum=num;
        while(dupnum!=0){
            dupnum=dupnum/10;
            numberOfDigits++;
        }

        if(numberOfDigits%2==1){
            while(num!=0){
                digit=num%10;
                if(count%2==0)
                {
                    sumeven+=digit;
                }
                else{
                    sumodd+=digit;
                }
                count++;
                num=num/10;
            }
        }
        else{
            while(num!=0){
                digit=num%10;
                if(count%2==0)
                {
                    sumodd+=digit;
                }
                else{
                    sumeven+=digit;
                }
                count++;
                num=num/10;
            }
        }

        System.out.println("sum even: "+sumeven);
        System.out.println("sum odd: "+sumodd);

        sc.close();
    }
}
