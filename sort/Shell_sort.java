package sort;

public class Shell_sort {
/* 	Shell sort is a highly efficient sorting algorithm and is based on insertion sort algorithm. 
*	This algorithm avoids large shifts as in case of insertion sort, if the smaller value is to
*	the far right and has to be moved to the far left.

/* This algorithm uses insertion sort on a widely spread elements, first to sort them and then sorts the less widely spaced elements.
	This spacing is termed as interval. This interval is calculated based on Knuth's formula as −


// Knuth's Formula
// h = h * 3 + 1
// where −
//    h is interval with initial value 1
*/
	/*
	Algorithm

	Following is the algorithm for shell sort.

	Step 1 − Initialize the value of h
	Step 2 − Divide the list into smaller sub-list of equal interval h
	Step 3 − Sort these sub-lists using insertion sort
	Step 3 − Repeat until complete list is sorted

	*/

	public static void main(String args[]) {
		int arr[]= {35,33,42,10,14,19,27,44};
		for(int e:arr) {
			System.out.print(e+" ");
		}
		shell_sort(arr,0,arr.length-1);
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	
	static void shell_sort(int arr[],int l,int h) {
		int gap=1;
		while(gap<arr.length/3) {
			gap=(gap*3)+1;
			System.out.println("gap "+gap);
		}
		while(gap>0) {
			System.out.println("mainwhile");
			for(int i=gap;i<arr.length;i++) {
				int j=i;
				System.out.println("i "+i);
				while(j>0) {
					System.out.println("j "+j);
					if(j-gap>=0) {
						//System.out.println(j+" "+(j-gap));
						if(arr[j]>arr[j-gap]) {
							int temp=arr[j];
							arr[j]=arr[j-gap];
							arr[j-gap]=temp;
							j-=gap;
						}
						else {
				//			System.out.println("else");
								break;
						}
						
					}
					else {
					//	System.out.println("else");
							break;
					}
				}
			}
			gap=(gap-1)/3;
		}
	}
}
