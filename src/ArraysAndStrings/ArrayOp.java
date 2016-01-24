package ArraysAndStrings;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,8,7,6,3,4,3,7,7,9}; 
		ArrayOp op = new ArrayOp();
		int[] temp = op.dutchPartition(arr, 3);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		
	}


public int[] dutchPartition(int[] arr, int k){	
	int pivot = arr[k];
	int start = 0; 
	int end =  arr.length-1; 
	while(start<end){
		
		while(arr[start] <= pivot){
			start++; 
		}
		while(arr[end] > pivot){
			end--; 
		}
		if(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			start++;
			end--;  		
		}
		
	} 
	int i=0;
	while(arr[i]<=pivot){
		i++;
	}
	start =0;
	end = i-1;
	while(start<end){
		while(arr[start] < pivot){
			start++; 
		}
		while(arr[end] == pivot){
			end--; 
		}
		if(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			start++;
			end--;  		
		}
	}
	return arr; 

}
}
