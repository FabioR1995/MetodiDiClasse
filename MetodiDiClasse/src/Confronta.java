import java.util.Scanner;

public class Confronta {

	public static void main(String[] args) {
		int primo;
		int secondo;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		primo=tastiera.nextInt();
		System.out.println("Inserisci il secondo numero");
		secondo= tastiera.nextInt();
		tastiera.close();
		System.out.println("Il risultato di questa operazione e': ");
		System.out.println(confronta(primo, secondo));
	}
	
	public static int confronta(int primo,int secondo){
		int risultato;
		if(primo>secondo)
			risultato=primo-secondo;
		else
			risultato= secondo-primo;
		return risultato;
	}

}
