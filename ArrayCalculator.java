package Session5.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculator {

	private int[][] arr;
	private int[][] arr0 = {{0,0,0}, {0,0,0}, {0,0,0}};

	public ArrayCalculator(int row, int col){
		arr = new int[row][col];
	}
	public boolean equalDimension(int[][] arr1, int[][] arr2){
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length)
			return true;
		else
			return false;
	}
	public boolean checkDotProduct(ArrayCalculator m1, ArrayCalculator m2){
		int[][] arr1 = m1.arr;
		int[][] arr2 = m2.arr;

		if(arr1[0].length == arr2.length)
			return true;
		else
			return false;

	}
	public void product(ArrayCalculator m){

		if(checkDotProduct(this, m)){
			int[][] arr2 = m.arr;
			int sum = 0;
			int x = arr.length;
			int y = arr[0].length;
			int q = arr2[0].length;
			int p = arr2.length;

			int[][] product = new int[x][q];

			for (int i = 0; i < x; i++)
			{
				for (int j = 0; j < q; j++)
				{  
					for (int k = 0; k < p; k++)
					{
						sum = sum + arr[i][k]*arr2[k][j];
					}

					product[i][j] = sum;
					sum = 0;
				}
			}
			printMatrix(product);
		}else{
			System.out.println("The 2 Matrices are not Multipliable.");
		}

	}
	public void transpose(){
		//Print the Matrix before Transpose
		printMatrix();
		//New Array that will hold transposed MAtrix

		int n = arr.length;
		int m = arr[0].length;
		int[][] newArr = new int[m][n];
		for(int j = 0; j < arr[0].length; j++){
			for(int i = 0; i < arr.length; i++){
				newArr[j][i] = arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Successfully Transposed");
		printMatrix(newArr);
	}
	public int[][] timesZero(int[][] arr){
		int[][] arr2 = arr;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length;j++){
				arr2[i][j] = 0;
			}
		}
		return arr2;
	}
	public void difference(ArrayCalculator m){
		int[][] sum = m.arr;
		int[][] arr2 = m.arr;
		if(equalDimension(arr, arr2)){
			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr[0].length; j++){
					sum[i][j] = arr[i][j] - arr2[i][j];
				}
			}
			System.out.println("Succesfully Subtracted!");
			arr = sum;
			printMatrix();
		}else{
			System.out.println("Cannot Subtract those 2 Matrices.");
		}		
	}
	public void sum(ArrayCalculator m){
		int[][] sum = arr;
		int[][] arr2 = m.arr;
		if(equalDimension(arr, arr2)){
			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr[0].length; j++){
					sum[i][j] = arr[i][j] + arr2[i][j];
				}
			}
			arr = sum;
			System.out.println("The Sum was Calculated!");
			printMatrix();
		}else{
			System.out.println("Cannot Add those 2 Matrices.");
		}		
	}
	public void fillMatrix(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Matrix Values: ");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix was successfully filled!");
	}
	public void printMatrix(){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void printMatrix(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}


}
