package sort;

public class quikesort {
	/*
	 * Quick Sort, as the name suggests, sorts any list very quickly.
	 *  Quick sort is not stable search, but it is very fast and requires very less additional space. 
	 *  It is based on the rule of Divide and Conquer (also called partition-exchange sort). 
	 *  This algorithm divides the list into three main parts
	 *  
       Elements less than the Pivot          element Pivot element            Elements greater than the pivot element 
	  
	  
	  low  --> Starting index,  high  --> Ending index 
			quickSort(arr[], low, high)
			{
    				if (low < high)
    				{
         				pi is partitioning index, arr[pi] is now
           					at right place 
        					pi = partition(arr, low, high);

        				quickSort(arr, low, pi - 1);  // Before pi	
        				quickSort(arr, pi + 1, high); // After pi
        				
    				}
			}
	 
	 */
	
	
	
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	    array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	/*
	 * 
	 * partition (arr[], low, high)
	{
	    // pivot (Element to be placed at right position)
	    pivot = arr[high];  
	 
	    i = (low - 1)  // Index of smaller element

	    for (j = low; j <= high- 1; j++)
	    {
	        // If current element is smaller than the pivot
	        if (arr[j] < pivot)
	        {
	            i++;    // increment index of smaller element
	            swap arr[i] and arr[j]
	        }
	    }
	    swap arr[i + 1] and arr[high])
	    return (i + 1)
	}
	*/
	//EXAMPLE for ilustratinng the itatration
	
	
//	arr[] = {10, 80, 30, 90, 40, 50, 70}
//	Indexes:  0   1   2   3   4   5   6 

//	low = 0, high =  6, pivot = arr[h] = 70
//	Initialize index of smaller element, i = -1

//	Traverse elements from j = low to high-1
//	j = 0 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
//	i = 0 
//	arr[] = {10, 80, 30, 90, 40, 50, 70} // No change as i and j 
//	                                     // are same

//	j = 1 : Since arr[j] > pivot, do nothing
//	// No change in i and arr[]

//	j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
//	i = 1
//	arr[] = {10, 30, 80, 90, 40, 50, 70} // We swap 80 and 30 

//	j = 3 : Since arr[j] > pivot, do nothing
//	// No change in i and arr[]

//	j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
//	i = 2
//	arr[] = {10, 30, 40, 90, 80, 50, 70} // 80 and 40 Swapped
//	j = 5 : Since arr[j] <= pivot, do i++ and swap arr[i] with arr[j] 
//	i = 3 
//	arr[] = {10, 30, 40, 50, 80, 90, 70} // 90 and 50 Swapped 

//	We come out of loop because j is now equal to high-1.
//	Finally we place pivot at correct position by swapping
//	arr[i+1] and arr[high] (or pivot) 
//	arr[] = {10, 30, 40, 50, 70, 90, 80} // 80 and 70 Swapped 

//	Now 70 is at its correct place. All elements smaller than
//	70 are before it and all elements greater than 70 are after
//	it.
//	
//	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []arr= {10, 80, 30, 90, 40, 50, 70};
//		Quick_sort(arr,0,arr.length-1);
//		for(int e:arr) {
//			System.out.print(e+" ");
//		}
//
//	}
//	static void Quick_sort(int arr[],int l,int h) {
//		if(l<h) {
//			int pv= Partition( arr ,l, h);
//			Quick_sort(arr, l,pv-1);
//			Quick_sort(arr,pv+1,h);
//		}
//		
//	}
//	
//	static int Partition(int arr[],int l,int h) {
//		int pv=arr[l];
//		int i=l,j=h;
//		while(i<=h) {
//			if(arr[i]>pv) {
//				break;
//			}
//			i++;
//			
//		}
//		while(j>=l) {
//			if(arr[j]<=pv) {
//				break;
//			}
//			j--;
//		}
//		if(i<j) {
//			int s=arr[i];
//			arr[i]=arr[j];
//			arr[j]=s; 
//		}
//		else {
//			arr[l]=arr[j];
//			arr[j]=pv;
//			
//		}
//		return j;
//		}
//	
//
//}

	public static void main(String[] args) {
		
		int arr[] = {2,4,3,6,1,2,5,5,7,7,5,1,8,2,7,3,5,6,2,5,3,6,4,2,6,3,8,7,1,2,9,9,0};

		Quick_sort(arr,0,arr.length-1);
		System.out.println();
		for(int e:arr) {
		System.out.print(e+" ");
		}
		
	
	}
	static int partition(int[]arr,int h,int l) {
		System.out.println("L : "+l+" H: "+h);
		int i=l;
		int j=h;
		int p=arr[l];
		while(i<j) {
			while(arr[i]<=p&&i<h) {
				System.out.println("i "+i);
					i++;
				
			}
			while(arr[j]>p&&j>l) {
				System.out.println("j "+j);
					j--;
				
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			System.out.println("While i:"+i+" j:"+j);
		}
		arr[l]=arr[j];
		arr[j]=p;
		for(int e:arr) {
			System.out.print(e+" ");
			}
		System.out.println("p: "+j);
		return j;
		
		
	}
//	
	static void Quick_sort(int arr[],int l,int h) {
	if(l<h) {
		int pv= partition( arr ,h, l);
		Quick_sort(arr, l,pv-1);
		Quick_sort(arr,pv+1,h);
	}
	
}

}
	
