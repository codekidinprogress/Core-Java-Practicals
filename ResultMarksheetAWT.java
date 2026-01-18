package Practical_16;

import java.awt.*;
import java.awt.event.*;

public class ResultMarksheetAWT extends Frame implements ActionListener {
    
    Label label1, label2, label3, label4, label5, label6, label7, label8, label9;
    TextField textfield1, textfield2, textfield3, textfield4, textfield5;
    Button button;
    TextArea textarea;

    ResultMarksheetAWT() {
        setLayout(new FlowLayout());

        label1 = new Label("Student Name: ");
        textfield1 = new TextField(30);

        label2 = new Label("Roll No: ");
        textfield2 = new TextField(15);

        label3 = new Label("English: ");
        textfield3 = new TextField(5);

        label4 = new Label("Mathematics:");
        textfield4 = new TextField(5);

        label5 = new Label("Science:");
        textfield5 = new TextField(5);

        button = new Button("Generate Result");
        button.addActionListener(this);

        textarea = new TextArea(10, 40);


        add(label1); 
        add(textfield1);
        add(label2); 
        add(textfield2);
        add(label3); 
        add(textfield3);
        add(label4); 
        add(textfield4);
        add(label5); 
        add(textfield5);
        add(button);
        add(textarea);

        setTitle("Result Marks Sheet");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String name = textfield1.getText();
        String roll = textfield2.getText();
        int English = Integer.parseInt(textfield3.getText());
        int Mathematics = Integer.parseInt(textfield4.getText());
        int Science = Integer.parseInt(textfield5.getText());

        int total = English + Mathematics + Science;
        double percent = total / 3.0;
        String result;
        String comment=" ";
        if (percent<35) {
            result = "Fail";
            comment = "Sorry, You have Failed the Examination!!";
        } else if(percent>=60 && percent<90){
        	result="Pass";
        	comment = "Congratulation, You have Passed in Second Class!!";
        	
        }else if(percent>=90) {
        	result="Pass";
        	comment = "Congratulation, You have Passed in First Class!!";
        	
        }else {
            result = "Pass";
        }


        String output = "----- Result Marks Sheet -----\n";
        output += "Name: " + name + "\n";
        output += "Roll No: " + roll + "\n";
        output += "English: " + English + "\n";
        output += "Mathematics: " + Mathematics + "\n";
        output += "Science: " + Science + "\n";
        output += "Total: " + total + "\n";
        output += "Percentage: " + percent + "%\n";
        output += "Result: " + result + "\n";
        output += "Comment: " + comment + "\n";

        textarea.setText(output);
    }

    public static void main(String[] args) {
        new ResultMarksheetAWT();
    }
}

