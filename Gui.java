import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {

    private JList leftlist; 
    private JList rightlist; 
    private JButton movebutton; 
    private static String[] foods = {"Mushroom", "Onion and Cheese", "Burrito", "Alfredo", "Avocado Wraps", "Buffalo Wings", "Lasagna", "Ribs", "Cheese Wraps", "Chinese" };

    public Gui () {

        super("title");
        setLayout(new FlowLayout () );

        leftlist = new JList (foods);
        leftlist.setVisibleRowCount(5);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Copy >>>");
        movebutton.addActionListener(
                    new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        rightlist.setListData(leftlist.getSelectedValues() );
                    }


            }

        );
        add(movebutton);

        rightlist = new JList ();
        rightlist.setVisibleRowCount(5);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));

    }

}
