package sort;

public class Bubble_sort {

	/*
	 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
	 * if they are in wrong order
	 * 
	 * Example:
	First Pass:
	( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
	( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
	( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
	( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

	Second Pass:
	( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
	( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
	( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
	( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
	Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
	
	Third Pass:
	( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
	( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
	( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
	( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
	
	Complexity of Bubble Sort Algorithm
	In Bubble Sort, n-1 comparisons will be done in 1st pass, n-2 in 2nd pass, n-3 in 3rd pass and so on. So the total num
	comparisons will be
	F(n)=(n-1)+(n-2)+…………………………+2+1=n(n-1)/2 = O(n2) 


	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={5,1,4,2,8};
		Sort(a);
	}
	
	static void Sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			boolean b=false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
					b=true;
				}
			}
			
			for(int e:a) {
				System.out.print(e+" ");
			}
			
			System.out.println();
			if(!b) break;
		}
		for(int e:a) {
			System.out.print(e+" ans ");
		}
	}

}
