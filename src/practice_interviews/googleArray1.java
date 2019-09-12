package practice_interviews;

//finding nth order statistic

public class googleArray1 {
	public static class quickSort{
		
		int partition(int[] arr, int low, int high) {
			int pivot = arr[high];
			int i = (low-1);	//index of smaller element
			for(int j=low; j<high; j++) {
				//if current element is <= to pivot
				if(arr[j]<=pivot) {
					i++;
					
					//swap arr[i] and arr[j]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			//swap arr[i+1] and pivot
			int temp = arr[i+1];
			arr[i+1] = arr[high];
			arr[high] = temp;
			
			return i+1;
		}
		
		//implementing sorting algorithm for quick sort
		void sort(int[] arr, int low, int high) {
			if(low<high) {
				//pi is partitioning index
				int pi = partition(arr, low, high);
				
				//recursively sort elements before and after partition
				sort(arr, low, pi-1);
				sort(arr, pi+1, high);
			}
		}
	}
	
	public static int nOrdStat(int[] arr, int n) {
		if(arr.length==0) {
			return -99;
		}
		else if(n>arr.length) {
			return -99;
		}
		
		quickSort ob = new quickSort();
		ob.sort(arr, 0, arr.length-1);
		
		return arr[n-1];
		//time order will be nlogn because method is n but sorting in nlogn
	}
	
	public static int firstOrdStat(int[] arr) {
		if(arr.length==0) {
			return -99;
		}
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
		//time complexity will be n
	}

	public static void main(String[] args) {

		int[] arr = {1,6,3,9,8,5};
		//finding first order statistic
		System.out.println(firstOrdStat(arr));
		//finding nth order statistic
		System.out.println(nOrdStat(arr, 7));

	}

}
