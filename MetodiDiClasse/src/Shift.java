
import java.util.Scanner;

public class Shift {

	public static void main(String[] args) {
		String daShiftare;
		int n;
		Scanner tastiera= new Scanner(System.in);
		do{
			System.out.println("Inserisci una parola:");
			daShiftare=tastiera.next();
			System.out.println("Inserisci un numero che indichi il blocco da shiftare:");
			n= tastiera.nextInt();
			System.out.println("La parola shiftata e': "+ shift(daShiftare, n));
		}while(!(daShiftare.charAt(0)=='a'&& daShiftare.charAt(daShiftare.length()-1)=='a'));
	}
	
	public static String shift(String daShiftare, int n){
		String primoPezzo= daShiftare.substring(0, n);
		String secondoPezzo= daShiftare.substring(n,daShiftare.length());
		String parolaShiftata=secondoPezzo+primoPezzo;
		return parolaShiftata;
	}

}
