import java.util.Scanner;

public class ContaCaratteri {

	public static void main(String[] args) {
		String parola;
		int posizioneCarattere;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci una parola:");
		parola= tastiera.next();
		System.out.println("Inserisci un numero che faccia riferimento alla posizione di un carattere");
		posizioneCarattere=tastiera.nextInt();
		if(posizioneCarattere<parola.length()){
			System.out.print("Il carattere "+"["+parola.charAt(posizioneCarattere)+"]");
			System.out.println(" si ripete per "+conta(parola, parola.charAt(posizioneCarattere))+" volte");
		}
		else
			System.out.println("ERRORE: valore non valido");
	}
	
	public static int conta(String parola, char carattere){
		int contaCaratteri=0;
		for(int i=0;i<parola.length();i++){
			if(parola.charAt(i)==carattere)
				contaCaratteri++;
		}
		return contaCaratteri;
	}

}
