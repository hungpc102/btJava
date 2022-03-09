import javax.swing.JOptionPane;

public class bai10 {
    public static void  main(String[] args){
        double test1, test2, test3, average;
        String inputString;
        JOptionPane.showMessageDialog(null,"Please input the three test results");
        inputString=JOptionPane.showInputDialog("What was the first result?");
        test1=Double.parseDouble(inputString);
        inputString= JOptionPane.showInputDialog("what was the second result?");
        test2 = Double.parseDouble(inputString);
        inputString=JOptionPane.showInputDialog("What was the last result? ");
        test3 = Double.parseDouble(inputString);
        average=(test1+test2+test3)/3;
        String result= String.format("The average result %.2f",average);
        JOptionPane.showMessageDialog(null,result);
    }
}
