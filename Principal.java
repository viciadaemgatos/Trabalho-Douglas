package Ordenacao_e_pesquisa;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		String path = "C:\\Users\\familia\\Documents\\alice\\Faculdade\\Programação_de_soluções_computacionais\\Douglas\\Trabalho_Ordenador_de_arquivo\\teste.txt";
		
		System.out.println("---------------Menu---------------");
		System.out.println("1 - Método de ordenação Insertion Sort");
		System.out.println("2 - Método de ordenação  Sort");
		System.out.println("----------------------------------");
		System.out.println("Escolha uma opção do menu acima: ");
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			
			break;
		
		case 2:
			
			break;
			
		case 3:
			
			break;
		default: extracted(opcao);
		}
		
		ManipuladorArquivo.leitor(path);
		teclado.close();
	}

	private static void extracted(int opcao) {
		throw new IllegalArgumentException("Unexpected value: " + opcao);
	}
}
