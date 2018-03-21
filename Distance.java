import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Distance extends JFrame implements ActionListener {
    private JButton buttonCompute = new JButton("Compute");
    private JLabel labelA = new JLabel("Leg A:");
    private JLabel labelB = new JLabel("Leg B:");
    private JLabel labelC = new JLabel("Compute Distance Leg C.");
    private JTextField textA = new JTextField(10);
    private JTextField textB = new JTextField(10);
    
    public Distance() {
        buttonCompute.addActionListener(this);

        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //  newPanel
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        //  labelA
        constraints.fill = GridBagConstraints.HORIZONTAL;
        labelA.setHorizontalAlignment(SwingConstants.LEFT);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(labelA, constraints);

        //  textA
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(textA, constraints);

        //  labelB
        constraints.fill = GridBagConstraints.HORIZONTAL;
        labelB.setHorizontalAlignment(SwingConstants.LEFT);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(labelB, constraints);

        //  textB
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(textB, constraints);

        //  labelC
        constraints.fill = GridBagConstraints.HORIZONTAL;
        labelC.setHorizontalAlignment(SwingConstants.LEFT);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(labelC, constraints);

        //  buttonCompute
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 0;
        newPanel.add(buttonCompute, constraints);

        newPanel.setBackground(Color.pink);
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mathematical Operations"));

        add(newPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ComputeDistance");
        setSize(400,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        double doubleA = 0;
        double doubleB = 0;
        double doubleC = 0;
        String stringA = "";
        String stringB = "";

        stringA = textA.getText();
        stringB = textB.getText();

        if (!isDouble(stringA) && !isDouble(stringB)) {
            labelC.setText("Invalid input for Leg A and Leg B. Please enter number.");
        } else if (!isDouble(stringA)) {
            labelC.setText("Invalid input for Leg A. Please enter number.");
        } else if (!isDouble(stringB)) {
            labelC.setText("Invalid input for Leg B. Please enter number.");
        } else {
            doubleA = Double.parseDouble(stringA);
            doubleB = Double.parseDouble(stringB);
            doubleC = Math.sqrt((doubleA * doubleA) + (doubleB * doubleB));
            
            labelC.setText(String.format("Leg C: %.2f", doubleC));
        }
    }
    
    public boolean isDouble(String num) {
        try {
            Double.parseDouble(num);
            
            return true;
        } catch (NumberFormatException numFormatException) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Distance();
            }
        });
    }
}