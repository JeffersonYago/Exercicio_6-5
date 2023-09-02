package controller;

import bubblesort.BubbleSort;
import quickSort.Quick_Sort;
import mergiosort.Merge_Sort;
public class sortscontroller {

	public sortscontroller() {
		super(); 
	}
	public void bubbleSort(int[] vetor) {
		BubbleSort pc = new BubbleSort();
		double TempoInicial = System.nanoTime();
		int[] novovetor = pc.bubble_sort(vetor);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("tempo para BubbleSort: "+TempoTotal+ "seg");
	}
	public void quicksort(int[] vetor) {
		Quick_Sort pc = new Quick_Sort();
		int tamanho = vetor.length;
		double TempoInicial = System.nanoTime();
		int[] novovetor = pc.QuickSort(vetor, 0, tamanho - 1);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("tempo para QuickSort: "+TempoTotal+ "seg");
}
	public void mergesort(int[] vetor) {
		Merge_Sort pc = new Merge_Sort();
		int tamanho = vetor.length;
		double TempoInicial = System.nanoTime();
		int[] novovetor = pc.MergeSort(vetor, 0, tamanho - 1);
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		TempoTotal = TempoTotal / Math.pow(10, 9);
		System.out.println("tempo para MergeSort: "+TempoTotal+ "seg");
}
}