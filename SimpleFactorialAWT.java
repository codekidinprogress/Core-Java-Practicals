package Practical_12;

import java.awt.*;
import java.awt.event.*;

public class SimpleFactorialAWT extends Frame implements ActionListener {
    TextField input, output;
    Button calc;

    SimpleFactorialAWT() {
        setLayout(new FlowLayout());

        add(new Label("Number:"));
        input = new TextField(10);
        add(input);

        calc = new Button("Calculate");
        calc.addActionListener(this);
        add(calc);

        add(new Label("Factorial:"));
        output = new TextField(15);
        output.setEditable(false);
        add(output);

        setSize(300, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(input.getText());
            long fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            output.setText(String.valueOf(fact));
        } catch (Exception ex) {
            output.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleFactorialAWT();
    }
}
