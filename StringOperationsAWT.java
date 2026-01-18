package Practical_13;

import java.awt.*;
import java.awt.event.*;

public class StringOperationsAWT extends Frame implements ActionListener {
    
    TextField input1, input2, result;
    Button reverseBtn, concatBtn, upperBtn, lowerBtn, lengthBtn;

    public StringOperationsAWT() {
        setLayout(new FlowLayout());

        // Labels and text fields
        Label label1 = new Label("Input 1:");
        input1 = new TextField(20);

        Label label2 = new Label("Input 2:");
        input2 = new TextField(20);

        result = new TextField(40);
        result.setEditable(false);

        // Buttons
        reverseBtn = new Button("Reverse");
        concatBtn = new Button("Concatenate");
        upperBtn = new Button("To Uppercase");
        lowerBtn = new Button("To Lowercase");
        lengthBtn = new Button("Length");

        // Add components
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(reverseBtn);
        add(concatBtn);
        add(upperBtn);
        add(lowerBtn);
        add(lengthBtn);
        add(new Label("Result:"));
        add(result);

        // Register listeners
        reverseBtn.addActionListener(this);
        concatBtn.addActionListener(this);
        upperBtn.addActionListener(this);
        lowerBtn.addActionListener(this);
        lengthBtn.addActionListener(this);

        // Frame settings
        setTitle("String Operations - AWT");
        setSize(450, 300);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        String str1 = input1.getText();
        String str2 = input2.getText();
        String res = "";

        if (e.getSource() == reverseBtn) {
            res = new StringBuilder(str1).reverse().toString();
        } else if (e.getSource() == concatBtn) {
            res = str1 + str2;
        } else if (e.getSource() == upperBtn) {
            res = str1.toUpperCase();
        } else if (e.getSource() == lowerBtn) {
            res = str1.toLowerCase();
        } else if (e.getSource() == lengthBtn) {
            res = "Length of Input 1: " + str1.length();
        }

        result.setText(res);
    }

    // Main method
    public static void main(String[] args) {
        new StringOperationsAWT();
    }
}
