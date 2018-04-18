import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		int minimo;
		int massimo;
		int valore;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci il valore massimo:");
		massimo=tastiera.nextInt();
		System.out.println("Inserisci il valore minimo:");
		minimo=tastiera.nextInt();
		System.out.println("Inserisci un valore compreso tra il minimo e il massimo");
		valore=tastiera.nextInt();
		verificaValore(minimo, massimo, valore);
	}

	public static boolean verificaValore(int min,int max,int valore){
		boolean verifica;
		if(valore>=min && valore<=max){
			verifica = true;
			System.out.println("Il valore inserito e' compreso tra il minimo e il massimo");
		}
		else{
			verifica=false;
			System.out.println("Il valore inserito non e' compreso tra il minimo e il massimo");
		}
		return verifica;
	}
}
