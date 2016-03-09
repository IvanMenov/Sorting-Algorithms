import java.util.Arrays;

public class SelectionSort {
	
	static void selectionSort(int[]array){
		int start=0;
		int end=array.length-1;
		
		
		for (int i = 0; i <=array.length/2; i++) {
			int maxIndex=start;
			int minIndex=start;
			
			for (int j = start; j <=end; j++) {		
				if(array[j]>array[maxIndex]){
					maxIndex=j;
				}
				if(array[j]<array[minIndex]){
					minIndex=j;
				}
			}
				int temp=array[maxIndex];
				array[maxIndex]=array[end];
				array[end]=temp;
				
				if(minIndex==end){
					minIndex=maxIndex;
				}
				temp=array[minIndex];
				array[minIndex]=array[start];
				array[start]=temp;	
			end--;
			start++;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[]array= {20,5,8,15,-20};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
