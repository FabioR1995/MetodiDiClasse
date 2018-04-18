import java.util.Scanner;

public class Divisibile {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		int primo;
		int secondo;
		System.out.println("Inserisci il primo valore");
		primo=tastiera.nextInt();
		System.out.println("Inserisci il secondo valore");
		secondo=tastiera.nextInt();
		divisibile(primo, secondo);
	}

	public static boolean divisibile (int primo,int secondo){
		boolean verifica;
		if(secondo==0){
			verifica=false;
			System.out.println("ERRORE: Non e' possibile effettuare una divisone per 0");
		}
		else {
			System.out.println("Il risultato e': "+(primo/secondo));
			verifica=true;
		}
		return verifica;
		
	}
}
