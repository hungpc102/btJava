import java.util.Scanner;
public class bai2 {
    public static void main(String []args){
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the state abbbreviation: ");
        input=keyboard.nextLine();
        if (input.length()!=2) {
            System.out.println("Error - abbreviation must be 2 characters long.");
            System.exit(0);
        }
        input = input.toUpperCase();

        if (input.equals("NC")){
            System.out.println("North Carolina");
        }
        else if (input.equals("SC")){
            System.out.println("South Carolina");
        }
        else if (input.equals("GA")){
            System.out.println("Georgia");
        }
        else if (input.equals("FL")){
            System.out.println("Florida");
        }
        else if (input.equals("AL")){
            System.out.println("Alabam");
        }
        else {
            System.out.println("Error - State abbreviation not recognised!");
        }
    }
}