import javax.swing.JOptionPane;

public class EvenOrOddDV {

	public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Program uses Java GUI message and input dialogs. Program evaluates integers as even or odd." , "Message", JOptionPane.PLAIN_MESSAGE);
        
        String n1 = JOptionPane.showInputDialog(null, "Enter integer number: ");
		while (!isNumber(n1)) {
			n1 = JOptionPane.showInputDialog(null, "Invalid first number. Please enter a valid integer number");
        }
        
        int num = new Integer(n1);

        if ( num % 2 == 0 )
            JOptionPane.showMessageDialog(null, num + " is an even number." , "Message", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, num + " is an odd number." , "Message", JOptionPane.PLAIN_MESSAGE);

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