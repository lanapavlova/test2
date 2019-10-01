import java.util.Scanner;

public class Task3c_PrintChristmasTree {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+2; j++) {
				if (i+j < (n-3) || j-i > (n-3)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				if (j==n+1) {
					System.out.print("\n");
				}	
			}
		}
		
	}

}
