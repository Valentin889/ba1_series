package Serie4;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter un mot ou une phrase : ");
		String phrase = scanner.nextLine().toLowerCase();
		String phraseFinal = "";
		
		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			
			if(Character.isLetter(c)) {
				phraseFinal += c;
			}		
		}
		
		boolean val = true;
		
		for (int j = 0; j <= phraseFinal.length() / 2;  j++) {
			if(phraseFinal.charAt(j) != phraseFinal.charAt(phraseFinal.length()-1-j)) {
				val = false;
				break;
			}
		}
		
		System.out.println(phraseFinal);
		
		if(val) {
			System.out.println("palindrome ");
		} else {
			System.out.println("no palindrome ");
			
		}
	
	}
}
