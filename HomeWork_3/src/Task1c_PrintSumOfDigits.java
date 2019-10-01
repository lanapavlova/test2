import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum=0;
		
		do {
			 int rest =number%10;
			   number= number/10;
		       sum= rest+sum;
					
			
		} while (number>0);
		
 System.out.println(sum);
		sc.close();
	}

}
