import javax.swing.JOptionPane;

public class bai6 {
    public static void main(String[] args) {
        String input, result;
        int seconds=0, minute=0, hour=0, day=0;
        input = JOptionPane.showInputDialog("Enter the number of seconds");
        seconds = Integer.valueOf(input);

        if (seconds <= 60) {
            minute = seconds / 60;
            seconds = seconds % 60;
        }
        else if (seconds <= 3600) {
            hour = seconds / 3600;
            minute = (seconds % 3600) / 60;
            seconds = seconds % 60;
        }
        else if (seconds >=48000){
            day = seconds / 48000;
            hour = (seconds % 48000) / 3600;
            minute = (seconds % 3600) / 60;
            seconds = seconds % 60;
        }


        result = day + " day " + hour + " hour " + minute + " minute " + seconds + " seconds ";

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}
