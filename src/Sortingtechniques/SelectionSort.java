package Sortingtechniques;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = {7,13,9,5,3,2};
         for (int i=0 ;i<a.length;i++) {
        	 int  min=i;
        	 for (int j=i+1;j<a.length;j++) {
        		 if(a[j]<a[i]) {
        			 min=j;
        		 }
        		 int temp=a[i];
        		 a[i]=a[min];
        		 a[min]=temp;
        		
        		 
        	 }
        	 
         }
         for (int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
	}
	
}
