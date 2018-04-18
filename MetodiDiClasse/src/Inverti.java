import java.util.Scanner;

public class Inverti {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		String parola;
		System.out.println("Inserisci una parola:");
		parola=tastiera.next();
		int numero;
		System.out.println("Inserisci un numero:");
		numero=tastiera.nextInt();
		if(numero>parola.length()){
			System.out.println("ERRORE: il numero non puo' essere maggiore della lunghezza della parola!");
		}
		else
			System.out.println(inverti(parola, numero));
	}

	public static String inverti(String parola,int n){
		String inversa="";
		String restanteParola=parola.substring(n, parola.length());
		String parolaModificata;
		for(int i=restanteParola.length()-1;i>=0;i--){
			inversa=inversa+restanteParola.charAt(i);
		}
		parolaModificata=parola.substring(0,n)+inversa;
		return parolaModificata;
	}
}
