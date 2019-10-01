import java.util.Scanner;

public class Task1e_IsPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number= sc.nextInt();
		boolean isPrime=true;
		
		
		for (int i = 1; i <= number ; i++) {
			
		   if (i!=1 && i != number && number%i==0 ) {
			   isPrime=false;
			   }
		   }
		System.out.println(isPrime);
		sc.close();
				
	}

}
