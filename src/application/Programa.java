package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long inicio = System.currentTimeMillis();
		System.out.println("tamanho da lista ? ");
		int n = sc.nextInt();
		int[] lista  = new int[n];
		
		for (int i = 1; i < lista.length; i++) {
			lista[i] = (int)(Math.random() * lista.length);
		}
		System.out.println("Desordenado");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		//Insertion short
		int aux, j;
		for(int insertion = 1; insertion < lista.length; insertion++) {
			aux = lista[insertion];
			j = insertion-1;
			while(j >= 0 && lista[j] > aux) {
				lista[j+1] = lista[j];
				j--;
			}
			lista[j+1] = aux;
		}
		
		System.out.println("Ordenado por insertion Sort: /n");
		for (int insertion = 1; insertion < lista.length; insertion++) {
			System.out.println(lista[insertion]);
		}
		
		//selection sort
		
		int posicaoMenor, aux2;
		for(int selection = 0; selection < lista.length; selection++) {
			
			posicaoMenor = selection;
			for(int h = selection+1; h < lista.length;h++) {
				if(lista[h] < lista[posicaoMenor]) {
					posicaoMenor = h;
				}
			}
			aux2 =  lista[posicaoMenor];
			lista[posicaoMenor] = lista[selection];
			lista[selection] = aux2;
			
			
		}
		
		
		
		
		System.out.println("Ordenado por selection Sort: /n");
		for (int selection = 1; selection < lista.length; selection++) {
			System.out.println(lista[selection]);
		}
		
		
		
		//Bubble sort
		int aux3;
		for(int bubble = 0;bubble < lista.length;bubble++) {
			for(int k = bubble + 1; k < lista.length;k++) {
				if(lista[bubble] > lista[k]) {
					aux3 = lista[k];
					lista[k] = lista[bubble];
					lista[bubble] = aux3;
				}
			}
		}
		System.out.println("Ordenado por Bubble Sort: /n");
		for (int selection = 1; selection < lista.length; selection++) {
			System.out.println(lista[selection]);
		}
		
		long tempoFinal = System.currentTimeMillis();
		System.out.println("\n Tempo de Execuçao: " + (tempoFinal - inicio));
		sc.close();

	}

}
