import java.util.Scanner;

public class bai7 {
    public static void main(String[] args){
        double purchase;
        final double stateSaleTax=0.04;
        final double countySaleTax=0.02;
        double totalSaleTax;

        System.out.println("Enter purchase");
        Scanner keyboard = new Scanner(System.in);
        purchase= keyboard.nextDouble();
        totalSaleTax=purchase + purchase * stateSaleTax + purchase * countySaleTax;
        System.out.format("Amount of purchase: %.2f\n",purchase);
        System.out.format("State sales tax due: %.2f\n", stateSaleTax);
        System.out.format("County sales tax due: %.2f\n",countySaleTax);
        System.out.format("Total amount due: %.2f",totalSaleTax);

    }
}
