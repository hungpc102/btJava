import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        String numberRoman;
        int userNum;
        System.out.println("Enter a number from 1 -> 10");
        Scanner keyboard = new Scanner(System.in);
        userNum = keyboard.nextInt();
         switch (userNum){
             case 1:
                 numberRoman= "I";
                 break;
             case 2:
                 numberRoman= "II";
                 break;
             case 3:
                 numberRoman= "III";
                 break;
             case 4:
                 numberRoman= "IV";
                 break;
             case 5:
                 numberRoman= "V";
                 break;
             case 6:
                 numberRoman= "VI";
                 break;
             case 7:
                 numberRoman= "VII";
                 break;
             case 8:
                 numberRoman= "VIII";
                 break;
             case 9:
                 numberRoman= "IX";
                 break;
             case 10:
                 numberRoman= "X";
                 break;
             default:
                 numberRoman="Invalid - number should be in the range 1 to 10!";
                 break;

         }
         System.out.println(numberRoman);
    }
}
