package Practical_14;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class studentDetails extends Frame implements ActionListener{
		Label nameLabel, rollLabel, gradeLabel;
		TextField nameField, rollField, gradeField;
		Button addButton;
		TextArea displayArea;
		
		ArrayList<String>studentList;

		studentDetails() {
			setTitle("Student Information");
			setSize(400, 400);
			setLayout(new FlowLayout());
			setVisible(true);
		
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we) { 
					dispose();
				}
			});

			
		nameLabel = new Label("Name:");
		nameField = new TextField(15);
		
		rollLabel = new Label("Roll no:");
		rollField = new TextField(10);

		gradeLabel = new Label("Grade:");
		gradeField = new TextField(5);
		
		addButton = new Button("Add Student");
		addButton.addActionListener(this);
		
		displayArea = new TextArea(5, 35);
		displayArea.setEditable(false);
		
		studentList = new ArrayList<>();
		
		//adding components to frame
		add(nameLabel);
		add(nameField);
		
		add(rollLabel);
		add(rollField);
		
		add(gradeLabel);
		add(gradeField);
		
		add(addButton);
		add(displayArea);
	}
		
	//action handler
	public void actionPerformed(ActionEvent ae) {
		String name= nameField.getText().trim();
		String roll= rollField.getText().trim();
		String grade= gradeField.getText().trim();
		
		 
		if(name.isEmpty() || roll.isEmpty() || grade.isEmpty()) 
		{ 
			displayArea.setText("Please fill all fields.\n");
			return;
		}
		String studentInfo = "Name:" + name + ",Roll No:" + roll+ ", Grade:" + grade;
			
		studentList.add(studentInfo);
		nameField.setText("");
		rollField.setText("");
		gradeField.setText("");
		
		displayArea.setText("Student List:\n");
		for(String s:studentList) {
			displayArea.append(s+"\n");
		}
	}
	
	public static void main(String[] args) {
		new studentDetails();
	}
}
