package sort;

public class Shell_sort {
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
