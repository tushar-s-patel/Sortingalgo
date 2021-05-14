package sort;

public class Insertion_sort {
	/*
	 * Insertion sort is a simple sorting algorithm 
	 * that works similar to the way you sort playing cards in your hands.
	 *  The array is virtually split into a sorted and an unsorted part.
	 *   Values from the unsorted part are picked and placed at the correct position in the sorted part.
	 *Algorithm
	 *To sort an array of size n in ascending order:
	 *1: Iterate from arr[1] to arr[n] over the array.
	 *2: Compare the current element (key) to its predecessor.
	 *3: If the key element is smaller than its predecessor, compare it to the elements before.
	 * Move the greater elements one position up to make space for the swapped element.
	 * 
	 * 
	 *Algorithm            Worst Case        Average Case       Best Case
	 *Insertion Sort     n(n-1)/2 = O(n2)   n(n-1)/4 = O(n2)      O(n) 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 11, 13, 5, 6 };
		Sort(a);
	}
	
	static void Sort(int a[] ) {
		
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0) {
				
					if(k<a[j]) {
						a[j+1]=a[j];
						a[j]=k;
						j--;
					}
				
				else break;
			}
			
			for(int e:a) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
