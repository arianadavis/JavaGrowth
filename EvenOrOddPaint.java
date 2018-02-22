import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.sun.javafx.iio.common.ScalerFactory;
import com.sun.javafx.image.impl.IntArgb;

public class EvenOrOddPaint {

	public static void main(String[] args) {
        
        Integer coverage = 350; 
    
        JOptionPane.showMessageDialog(null, "Program uses Java GUI message and input dialogs. Program determines paint cost per room (i.e., area). \nFor paint area simplicty: use length x height x 2 / width x height x 2 \nFormat numbers as per below: thousand separator, decimal point and $ sign for currency. Research how many sqaure feet a gallon of paint covers. \nNote: program performs data validation." , "Message", JOptionPane.PLAIN_MESSAGE);
        
        String n1 = JOptionPane.showInputDialog(null, "Paint price per gallon: ");
        while (!isNumber(n1)) {
		  	  n1 = JOptionPane.showInputDialog(null, "Invalid first number. Please enter a valid integer number");
         }

        int num1 = new Integer (n1);
        
        String n2 = JOptionPane.showInputDialog(null, "Length ");
        while (!isNumber(n2)) {
          n2 = JOptionPane.showInputDialog(null, "Invalid second number. Please enter a valid integer number");
          }

        int num2 = new Integer (n2);

        String n3 = JOptionPane.showInputDialog(null, "Width ");
        while (!isNumber(n3)) {
          n3 = JOptionPane.showInputDialog(null, "Invalid third number. Please enter a valid integer number");
          }

        int num3 = new Integer (n3);

        String n4 = JOptionPane.showInputDialog(null, "Height ");
        while (!isNumber(n4)) {
          n4 = JOptionPane.showInputDialog(null, "Invalid fourth number. Please enter a valid integer number");
          }  

        int num4 = new Integer (n4);

        int fullArea = (num2 * num4 * 2) + (num3 * num4 * 2);
        int calcResult = (num1 * fullArea)/coverage; 

        DecimalFormat decimal = new DecimalFormat ("###,###.00");  

        JOptionPane.showMessageDialog(null, "Paint = $" + num1 + " per gallon\nArea of Room =  " + decimal.format(fullArea) + " sq.ft\nTotal = $" + decimal.format(calcResult) , "Message", JOptionPane.PLAIN_MESSAGE);

    }
    
    private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
  }
  
}
