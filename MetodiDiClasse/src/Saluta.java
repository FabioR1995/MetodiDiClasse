import java.util.Scanner;

public class Saluta {

	public static void main(String[] args) {
		int n;
		String nome;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci un nome:");
		nome= tastiera.next();
		System.out.println("Quante volte deve essere stampato?");
		n=tastiera.nextInt();
		System.out.println();
		saluta(nome, n);
	}
	
	public static void saluta(String nome, int n){
		for(int i=0;i<n;i++)
			System.out.println("ciao "+nome);
	}
}
