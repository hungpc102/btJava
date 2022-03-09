import javax.swing.JOptionPane;

public class bai12 {
    public static  void main(String[] args){
        String favoriteCity, lowerCity, upperCity;
        int cityLen;
        char firstChar;

        favoriteCity = JOptionPane.showInputDialog("Enter your favorite city name");
        upperCity=favoriteCity.toUpperCase();
        lowerCity=favoriteCity.toLowerCase();
        cityLen=favoriteCity.length();
        firstChar=favoriteCity.charAt(0);

        String result= String.format("city name: %s\nLower case: %s\nUpper case: %s\nLength of name: %d\nFirst letter: %c",favoriteCity,upperCity,lowerCity,cityLen,firstChar);
        JOptionPane.showMessageDialog(null,result);
        System.exit(0);
    }
}


