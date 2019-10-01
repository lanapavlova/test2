import java.util.Calendar;
import java.util.Scanner;

public class Task5_PersonCharacteristics {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		String firstName= sc.nextLine();
		if (firstName.matches([a-z A-Z])) {
			
		}

     
     int numToCheck = sc.nextInt();
	String lastName= sc.nextLine();
	short year = sc.nextShort();
	float weight = sc.nextFloat();
	short tall = sc.nextShort();
	String profession = sc.nextLine();
	int currentyear = Calendar.getInstance().get(Calendar.YEAR);
	System.out.println( firstName+ " "+ lastName+" "+ "is " + (currentyear- year)+ ". His weight is "+ weight + " and he is "+ tall+ " cm tall." + " He is a "+ profession+".");
   
	
	sc.close();
}

}
