import java.util.Scanner;

public class Task2b_PrintReversedSequence {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size= sc.nextInt();
	int array[]= new int [size];
	
	for (int i = 0; i < array.length; i++) {
		
		array[i]=sc.nextInt();
		
	}
	
	for (int i = array.length-1; i >=0; i--) {
		System.out.println(array[i]);
		
	}
	
	
	sc.close();
}
}
