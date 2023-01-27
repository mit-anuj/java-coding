import java.util.Scanner;

public class assignment2_ques2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your basic salary: ");
        int basic_salary=sc.nextInt();
        float hra=(float)(basic_salary*0.5);
        System.out.println("HRA : "+ (hra));
        float ta=(float)(basic_salary*0.3);
        System.out.println("TA: "+ (ta));
        float ma=(float)(basic_salary*0.25);
        System.out.println("MA: "+(ma));
        float pf=(float)(basic_salary*0.1);
        System.out.println("PF: "+(pf));
        float gross_salary=(float)(basic_salary+hra+ta+ma);
        System.out.println("Gross salary: "+gross_salary);
        float tax=(float)(gross_salary*0.1);
        System.out.println("Tax: "+tax);
        float net_salary=gross_salary-tax-pf;
        System.out.println("Net Salary: "+net_salary);

        sc.close();
    }
}