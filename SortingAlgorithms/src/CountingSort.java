
public class CountingSort {
	
	static void countingSort(int[]array){
		int max=array[0];
		int min=array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
		}
		int[] count= new int[max-min+1];
		for (int i = 0; i < array.length; i++) {
			int num=array[i]-min;
			count[num]++;
		}
		for (int i = 0; i < count.length; i++) {
			int occurance=count[i];
			while(occurance>0){
				System.out.print(i+min+" ");
				occurance--;
			}
		}
	}

	public static void main(String[] args) {
		int[]array= {-1, -1, 3, 0, 2, 1, 1, 4 };
		countingSort(array);


	}

}
