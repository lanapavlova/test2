
public class Task4b_PrintCountOfWords {
	
	public static void main(String[] args) {
		
		String str= "Peter loves dogs. He doesn’t like cats.";
		String[] a = str.split(" ");
			
		
		int wordsCount = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			if(true) {
				wordsCount += 1;
			}
		}
		
		
		System.out.println(wordsCount);
		
	}
}
