import java.util.Scanner;

public class Task3b_PrintZFigure {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (i == 0 || i == number-1 || j == (number-1)-i) {
						System.out.print("* ");
				}else {
					System.out.print("  ");
			}
				if (j==number-1) {
					System.out.print("\n");
				}	
			}
		}
	}
}
		