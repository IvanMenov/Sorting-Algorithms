import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[]array= {2,8,-6,20,12,5};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	static void bubbleSort(int[]array){
		for (int i = 0; i < array.length; i++) {
			boolean isSorted=true;
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					isSorted=false;
				}
			}if(isSorted==true){
				break;
			}
		}
	}
}
