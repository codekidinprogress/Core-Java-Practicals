package Practical_08;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Ask user for matrix size
		System.out.println("Enter number of rows:");
		int rows=scanner.nextInt();
		System.out.println("Enter number of columns:");
		int cols=scanner.nextInt();
		
		//Declare arrays(matrices)
		int[][]matrix1=new int[rows][cols];
		int[][]matrix2=new int[rows][cols];
		int[][]result=new int[rows][cols];
		
		//Input first matrix
		System.out.println("Enter elements of first matrix:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}
		
		//Input second matrix
		System.out.println("Enter elements of second matrix:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}
		
		//Add both matrices
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				result[i][j]=matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//Print the result matrix
		System.out.println("Resultant Matrix after addition:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println(result[i][j]+"");
			}
			System.out.println();
		}
		scanner.close();
	}

}
