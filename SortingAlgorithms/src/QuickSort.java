import java.util.Arrays;

public class QuickSort {
	
	static void swap(int[]array, int x, int y){
		int temp= array[x];
		array[x]=array[y];
		array[y]=temp;
	}
	static int partition(int[]array, int left, int right){
		int randomIndex=(int)((Math.random()*(right-left+1))+left);
		swap(array, right, randomIndex);
		int pivot=array[right];
		int k= left-1;
		
		for (int index = left; index <= right; index++) {
			if(array[index]<=pivot){
				k++;
				swap(array,k,index);
			}
		}return k;
	}
	static void quickSort(int[]array, int left, int right){
		
		if(left>=right){
			return;
		}
		
		int k=partition(array, left, right);
		quickSort(array,k+1,right);
		quickSort(array, left, k-1);
		
	}

	public static void main(String[] args) {
		int[]a= {2,0,9,-6,7,3};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}

}
