import java.util.Scanner;

public class ContaVocali {

	public static void main(String[] args) {
		String parola;
		int contaVocali;
		Scanner tastiera= new Scanner(System.in);
		do{
			System.out.println("Inserisci una parola con almeno 5 vocali");
			parola= tastiera.next();
			String parolaMaiuscola=parola.toUpperCase();
		    contaVocali=contaVocali(parolaMaiuscola);
		    System.out.println("Il numero di vocali presenti in questa parola e': "+contaVocali);
		}while(contaVocali<5);		
	}

	public static int contaVocali(String parola){
		int contatore=0;
		for(int i=0;i<parola.length();i++){
			char temp=parola.charAt(i);
			if(temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
				contatore++;
		}
		return contatore;
	}
}
