package sort;

public class Merge_sort {
	/**
	 * Merge Sort is a Divide and Conquer algorithm.
	 *  It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
	 *  
	 * The merge() function is used for merging two halves.
	 *  The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. 
	 * 
	 * 
	 * MergeSort(arr[], l,  r)
         If r > l
         1. Find the middle point to divide the array into two halves:  
                     middle m = (l+r)/2
         2. Call mergeSort for first half:   
                     Call mergeSort(arr, l, m)
         3. Call mergeSort for second half:
                     Call mergeSort(arr, m+1, r)
         4. Merge the two halves sorted in step 2 and 3:
                     Call merge(arr, l, m, r) 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12 ,11, 13, 5 ,6, 7};
		mergesort(arr,0,arr.length-1);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}
	
	static void merge(int[]arr , int l,int m,int h) {
		int i=l;
		int j=m+1;
		int k=0;
		int[] c=new int[h-l+1];
		while(i<=m&&j<=h) {
			if(arr[i]<arr[j]) {
				c[k]=arr[i];
				i++;
			}
			else {
				c[k]=arr[j];
				
				j++;
			}
			k++;
		}
		while(i<=m) {
			c[k]=arr[i];
			k++;i++;
		}
		while(j<=h) {
			c[k]=arr[j];
			k++;j++;
		}
		for(int p=0,q=l;p<c.length;p++,q++) {
			arr[q]=c[p];
		}
		
	}
	
	static void mergesort(int[]arr,int l,int h) {
		int m;
		m=(l+h)/2;
		if(h>l) {
			mergesort(arr,l,m);
			mergesort(arr,m+1,h);
			merge(arr,l,m,h);
		}
		
	}

}
