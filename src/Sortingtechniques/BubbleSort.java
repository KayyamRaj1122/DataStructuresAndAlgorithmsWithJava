package Sortingtechniques;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		int a[]= {5,2,8,4,1};
		
		for (int i=0;i<a.length;i++) {
		for (int j=0;j<a.length-1;j++) {
			//Swapping
		if (a[j]>a[j+1]) {
			 int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}
		}
		}
		
		System.out.println(Arrays.toString(a));//We can print new Array by iterating By loop As well
		
	}

}
