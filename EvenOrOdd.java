import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.sun.javafx.iio.common.ScalerFactory;

public class EvenOrOdd {

	public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Program uses Java GUI message and input dialogs. Program evaluates integers as even or odd." , "Message", JOptionPane.PLAIN_MESSAGE);

        String fn = JOptionPane.showInputDialog("Enter integer number: ");
        int num = Integer.parseInt(fn);     
		
	    if ( num % 2 == 0 )
            JOptionPane.showMessageDialog(null, num + " is an even number." , "Message", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, num + " is an odd number." , "Message", JOptionPane.PLAIN_MESSAGE);

    }

}
