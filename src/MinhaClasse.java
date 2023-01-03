import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
//		String nome = args[0];
//		String sobreNome  = args[1];
//		int idade = Integer.parseInt(args[2]);
//		double altura = Double.parseDouble(args[3]);
		
		System.out.println("Nome: " );
		String nome = scanner.next();
		
		System.out.println("Sobre Nome: ");
		String sobreNome = scanner.next();
		
		System.out.println("Idade: " );
		int idade = scanner.nextInt();
		
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
	}

}
