import java.util.Scanner;

public class Trova {

	public static void main(String[] args) {
		String primaParola;
		String secondaParola;
		char carattere;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci la prima parola:");
		primaParola=tastiera.next();
		System.out.println("Inserisci la seconda parola:");
		secondaParola=tastiera.next();
		if(primaParola.length()==secondaParola.length()){
			System.out.print("Il primo carattere della seconda parola e' ");
			System.out.println("presente nella prima parola?");
			System.out.println(trovaCarattere(primaParola, secondaParola.charAt(0)));
		}
		else {
			System.out.print("L' ultimo carattere della prima parola e' ");
			System.out.println("presente nella seconda parola?");
			System.out.println(trovaCarattere(secondaParola, primaParola.charAt(primaParola.length()-1)));
		}
	}
	
	public static boolean trovaCarattere (String parola,char carattere){
		boolean trovato = false;
		for(int i=0;i<parola.length();i++){
			if(parola.charAt(i)==carattere)
				trovato=true;  //mettere un else riassegnando alla variabile booleana false e' un errore
		}
		return trovato;   
	}

}
