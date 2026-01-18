package Practical_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;

public class CalculatorApp extends Frame implements ActionListener{
	Label input1, input2, result;
	TextField input1Field, input2Field, displayArea;
	Button add, sub, mul, div, clear;
    
	CalculatorApp() {
		setTitle("Calculator");
		setSize(500, 250);
		setLayout(new FlowLayout());
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) { 
					dispose();
		}
	});
		input1 = new Label("First Number");
		input1Field = new TextField(5);
		
		input2 = new Label("Second Number");
		input2Field = new TextField(5);
		
		add = new Button("+");
		add.addActionListener(this);
		
		sub = new Button("-");
		sub.addActionListener(this);
		
		mul= new Button("*");
		mul.addActionListener(this);
		
		div = new Button("/");
		div.addActionListener(this);
		
		result = new Label("Calculate");
		displayArea = new TextField(10);
		displayArea.setEditable(false);
		
		clear = new Button("Clear");
		
		add(input1);
		add(input1Field);
		add(input2);
		add(input2Field);
		add(add);
        		add(sub);
       	 	add(mul);
        		add(div);
        		add(result);
        		add(displayArea);
        		add(clear);

        		add.addActionListener(this);
        		sub.addActionListener(this);
        		mul.addActionListener(this);
        		div.addActionListener(this);
        		clear.addActionListener(this);    
	}

        	public void actionPerformed(ActionEvent ae) {
        		try {
        			double input1 = Double.parseDouble(input1Field.getText());
                		double input2 = Double.parseDouble(input2Field.getText());
                		double result = 0;
                

                	if (ae.getSource() == add) {
                    	result = input1 + input2;
                	} else if (ae.getSource() == sub) {
                    	result = input1 - input2;
                	} else if (ae.getSource() == mul) {
                    	result = input1 * input2; 
                	} else if (ae.getSource() == div) {
                    	result = input1 / input2;
                	}else if(ae.getSource() == clear) {
                	input1Field.setText("");
                	input2Field.setText("");
                	displayArea.setText("");
                	return;
                }
                displayArea.setText( " "  + " " + result);
        	}catch(NumberFormatException nfe){
        		displayArea.setText("Invalid input");
        	}
        }
	public static void main(String[] args) {
		new CalculatorApp();
	}
}
