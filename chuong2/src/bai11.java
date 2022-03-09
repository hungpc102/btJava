import javax.swing.JOptionPane;
public class bai11 {
    public static  void main(String[] args){
        double retailPrice;
        final double precentProfit = 0.4;
        String inputString;
        inputString=JOptionPane.showInputDialog("Enter the perencet profit");
        retailPrice=Double.parseDouble(inputString);
        double profit=retailPrice * precentProfit;
        String result = String.format("profit is %.2f",profit);
        JOptionPane.showMessageDialog(null,result);
    }
}
