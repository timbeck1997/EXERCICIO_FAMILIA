import java.util.Scanner;

import utilidade.Familia;
import utilidade.Integrantes;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Familia familia = new Familia("Beck");
		Integrantes integrante;
		System.out.printf("Digite a quantidade de integrantes da familia: ");
		int qt_familiares = input.nextInt();
		for (int i = 0; i < qt_familiares; i++) {
			System.out.printf("Digite o nome do familiar: ");
			String nome = input.next();
			System.out.printf("Digite o ID do familiar: ");
			int id = input.nextInt();
			System.out.printf("Digite o salario dele: ");
			double salario = input.nextDouble();
			integrante = new Integrantes(nome, id, salario);
			familia.addintegrante(integrante);
		}
		familia.getIntegrantes();
		
	}

}
