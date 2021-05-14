package sort;

public class Selection_sort {
	/*
	 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
	 * (considering ascending order) from unsorted part and putting it at the beginning.
	 *  The algorithm maintains two subarrays in a given array.

 	 1) The subarray which is already sorted.
	 2) Remaining subarray which is unsorted.

	*In every iteration of selection sort, 
	*the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
	 
	 *
	 *
	 *ALGORITHM EXAMPLE
	 *arr[] = 64 25 12 22 11

	// Find the minimum element in arr[0...4]
	// and place it at beginning
	11 25 12 22 64

	// Find the minimum element in arr[1...4]
	// and place it at beginning of arr[1...4]
	11 12 25 22 64

	// Find the minimum element in arr[2...4]
	// and place it at beginning of arr[2...4]
	11 12 22 25 64

	// Find the minimum element in arr[3...4]
	// and place it at beginning of arr[3...4]
	11 12 22 25 64 
	 *
	 *
	 *COMPLEXITY
	 *The number of comparison in the selection sort algorithm is independent of the original order of the element. 
	 *That is the comparison during PASS 1 to find the smallest element, 
	 *there are n-2 comparisons during PASS 2 to find the second smallest
     *and so on. Accordingly
     *
     *
     *F(n)=(n-1)+(n-2)+…………………………+2+1=n(n-1)/2 = O(n2) 
     *
     *Algorithm             Worst Case             Average Case                Best Case
     *Selection Sort      n(n-1)/2 = O(n2)        n(n-1)/2 = O(n2)              O(n2) 
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,6,1,8,4,5};
		sort(a);
	}
	
	static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				 if(a[i]>a[j]) {
					 int k=a[j];
					 a[j]=a[i];
					 a[i]=k;
				 }
			}
			
			for(int e:a) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
