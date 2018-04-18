import java.util.Scanner;

public class OrdinaStampa {

	public static void main(String[] args) {
		Scanner tastiera= new Scanner(System.in);
		int primo;
		System.out.println("Inserisci il primo valore:");
		primo=tastiera.nextInt();
		int secondo;
		System.out.println("Inserisci il secondo valore:");
		secondo= tastiera.nextInt();
		int terzo;
		System.out.println("Inserisci il terzo valore:");
		terzo= tastiera.nextInt();
		ordinaEStampa(primo, secondo, terzo);
		
	}
	
	public static void ordinaEStampa(int primo,int secondo, int terzo){
		if(primo>secondo && primo>terzo && secondo>terzo)
			System.out.println(primo+", "+secondo+", "+ terzo);
		else if(secondo>primo && secondo>terzo && primo>terzo)
			System.out.println(secondo+", "+primo+", "+ terzo);
		else if(terzo>primo && terzo>secondo && primo>secondo)
			System.out.println(terzo+", "+primo+", "+ secondo);
		else if(terzo>primo && terzo>secondo && secondo>primo)
			System.out.println(terzo+", "+secondo+", "+ primo);
		else if(primo>secondo && primo>terzo && terzo>secondo)
			System.out.println(primo+", "+terzo+", "+ secondo);
		else 
			System.out.println(secondo+", "+terzo+", "+ primo);
	}

}
