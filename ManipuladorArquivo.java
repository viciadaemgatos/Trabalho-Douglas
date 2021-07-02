package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

import Ordenação.PesquisaLinear;
import Ordenação.pesquisaBinaria;

public class ManipuladorArquivo{
	
	public static String linha;
	public static long linha_num;
	public static boolean terminou = false;
	static Scanner teclado = new Scanner(System.in);
	public static ArrayList<Long> numeros = new ArrayList<Long>();
	
	public static void leitorInsertionSort(String path) throws IOException {
		//Insertion sort
		int j;
		Long x;
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
		
		while (true) {
			if (linha != null) {
				linha_num = Long.parseLong(linha);
				numeros.add(linha_num);
		        Arrays.toString(numeros.toArray());
			} else
				break;
				linha = buffRead.readLine();
			}
        
      		for (int i = 1; i < numeros.size(); i++) {
	       		x = numeros.get(i);
	        	j = (int) (i - 1);
	            	while (j >= 0 && numeros.get(j) > x) {
	                	numeros.set(j + 1, numeros.get(j));
	                	j = j - 1;
	            	}
	            	numeros.set(j + 1, x);
        	}
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	    Pesquisas.pesquisa(null);
		buffRead.close();
	}
	
	public static void leitorBubbleSort(String path) throws IOException {
		//Bubble sort
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
		
		
		
		while (true) {
				if (linha != null) {
					linha_num = Long.parseLong(linha);
					numeros.add((long) linha_num);
			        Arrays.toString(numeros.toArray());
				} else
					break;
	        for(int i = 0; i < numeros.size() - 1; i++) {
	        	boolean estaOrdenado = true;
			    for(int j = 0; j < numeros.size() - 1 - i; j++) {
			    	if(numeros.get(j) > numeros.get(j + 1)) {
			    		Long aux = numeros.get(j);
			    		numeros.set(j, numeros.get(j + 1));
			    		numeros.set(j + 1, aux);
			    		estaOrdenado = false;
			    	}
			    }
			    if(estaOrdenado)
			        break;
			}
	        
	        for (int i = 0; i < numeros.size(); i++) { 
	        	numeros.get(i);
	            if(numeros.get(i) > linha_num){
	                linha_num = numeros.get(i);
	            }
	        }
		linha = buffRead.readLine();
		}
        
        	for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
    	Pesquisas.pesquisa(null);
		buffRead.close();

	}
	public static void QuickSort(ArrayList<Long> num, int ini, int fim) {
		int i = ini;
		int f = fim;
		Long pivo = num.get((int) ((i + f) / 2));
		Long k;

		while (i <= f) {
			while (num.get(i) < pivo) {
				i = i + 1;
			}
			while (num.get(f) > pivo) {
				f = f - 1;
			}
			if (i <= f) {
				k = num.get(i);
				num.set(i, num.get(f));
				num.set(f, k);
				System.out.println("Esquerda "+num.get(i));
				System.out.println("Direita "+num.get(f));
				i = i + 1;
				f = f - 1;
			}
		}
		if (f > ini)
			QuickSort(num, ini, f);

		if (i < fim)
			QuickSort(num, i, fim);

	}
	public static ArrayList<Long> leitorQuickSort() throws IOException{
        String path = "C:/Users/Lucas/Desktop/ordenacao_e_pesquisa/src/NumerosOrdenarArquivo1.txt";

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
		
		ArrayList<Long> numeros = new ArrayList<Long>();
		
		while (true) {
			if (linha != null) {
				linha_num = Long.parseLong(linha);
				numeros.add(linha_num);
		        Arrays.toString(numeros.toArray());
			} else
				break;
				linha = buffRead.readLine();
			}
		Sort(numeros, 0, numeros.size() - 1);
    }
}
