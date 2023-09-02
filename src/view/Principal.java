package view;

import controller.sortscontroller;

public class Principal {

	public static void main(String[] args) {
		sortscontroller pc = new sortscontroller();
		int[] vetor = new int [1500];
		for(int i = 0; i<1500; i++) {
			vetor[i] = (int)(Math.random() * 999) + 500;
		}
		int[] vetor1 = new int [1500];
		for(int i = 0; i<1500; i++) {
			vetor1[i] = (int)(Math.random() * 999) + 500;
		}
		int[] vetor2 = new int [1500];
		for(int i = 0; i<1500; i++) {
			vetor2[i] = (int)(Math.random() * 999) + 500;
		}
		pc.bubbleSort(vetor);
		pc.mergesort(vetor1);
		pc.quicksort(vetor2);
	}
}
