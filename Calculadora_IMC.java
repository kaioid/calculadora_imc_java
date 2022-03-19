import java.util.Locale;
import java.util.Scanner;

public class Calculadora_IMC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite sua altura(m): ");
		double altura = sc.nextDouble();
		System.out.println("Digite seu peso(kg): ");
		double peso = sc.nextDouble();
		
		sc.close();
		
		double imc = peso / Math.pow(altura, 2);
		
		
		if(imc < 18.5) {
			System.out.printf("Seu I.M.C. é: " + String.format("%.2f", imc) + " você se enquadra na classificação Magreza.");
		}
		else if(imc < 24.9) {
			System.out.printf("Seu I.M.C. é: " + String.format("%.2f", imc) + " você se enquadra na classificação Normal.");
		}
		else if (imc < 29.9) {
			System.out.printf("Seu I.M.C. é: " + String.format("%.2f", imc) + " você se enquadra na classificação Sobrepeso.");
		}
		else if (imc < 39.9) {
			System.out.printf("Seu I.M.C. é: " + String.format("%.2f", imc) + " você se enquadra na classificação Obesidade.");
		}
		else {
			System.out.printf("Seu I.M.C. é: " + String.format("%.2f", imc) + " você se enquadra na classificação Obesidade Grave.");
		}
			
	}

}
