package sorting;

public class MergeSort {

	private int[] array;
	private int[] tempMergeArr;
	private int length; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArr = {45,23,11,89,77,98,4,28};
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for(int i:inputArr){
			System.out.println(i);
			System.out.print(" ");
		}
	}

	public void sort(int inputArr[]){
		this.array = inputArr; 
		this.length = inputArr.length;
		this.tempMergeArr = new int[length]; 
		
		doMergeSort(0,length-1);
		
	}

	private void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			doMergeSort(lowerIndex,middle); 
			doMergeSort(middle+1,higherIndex); 
			mergeParts(lowerIndex,middle,higherIndex); 
		}	
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex){
		
		for(int i =lowerIndex; i<= higherIndex;i++){
			tempMergeArr[i] = array[i];
		}
		int i = lowerIndex; 
		int j = middle +1;
		int k = lowerIndex; 
		while(i<=middle && j<=higherIndex){
			if(tempMergeArr[i] <= tempMergeArr[j]){
				array[k] = tempMergeArr[i];
				i++;
			}else{
				array[k] = tempMergeArr[j];
				j++;
			}
			k++; 
		}
		while(i<= middle){
			array[k] = tempMergeArr[i];
			k++;
			i++; 
		}
		while(j<=higherIndex){
			array[k] = tempMergeArr[j];
			k++;
			j++; 
			
		}
	
	}

}



