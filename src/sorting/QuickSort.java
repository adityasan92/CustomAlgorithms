package sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			QuickSort qs = new QuickSort(); 
			int[] arr = {45,78,56,34,54,34,78,90,23,86,45,23,24,523,465};
			qs.sort(arr);
	}
	
	public void sort(int arr []){
		sort(arr, 0, arr.length -1);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public void sort(int arr[], int left, int right){
		int index = partition(arr,left,right);
		if(left<index-1)
			sort(arr,left,index-1);
		if(right>index)
			sort(arr,index,right); 
		
	}
	
	private int partition(int arr[],int left, int right){
		int i = left, j =right;
		int temp; 
		int pivot = arr[(left+right)/2];
		
		while(i<=j){
			
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j){
				temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp; 
				i++;
				j--;
			}
		}
		
		return i; 
	}
}
