import java.util.Scanner;
public class SalarioFamilia {

	public static void main(String[] args) {
		// salario, valorVendas, percentual
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Esse programa calcularar o percentual de ganho encima do valor total de vendas de um vendedor mais o salario base");
		System.out.println("Qual o salário base?");
		double salarioBase = scanner.nextDouble();
		
		System.out.println("Qual o valor total das vendas?");
		double valorVendas = scanner.nextDouble();
		
		System.out.println("Qual o percentual de lucro encima do valor total de vendas?");
		Double percentual = scanner.nextDouble();
		
		double salario = salarioBase + (valorVendas*(percentual/100));
		
		
		System.out.println("O valor do salário é "+ salario);

	}

}