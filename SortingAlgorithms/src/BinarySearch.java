import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[]array= new int[101];
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
		}
		int left=0;
		int right=array.length-1;
		int middle=(left+right)/2;
		
		System.out.print(array[middle]);
		System.out.print("- is this your number?");
		Scanner scan= new Scanner(System.in);
		System.out.println();
		String x=scan.nextLine();
	
		while(!x.equalsIgnoreCase("yes")){
			if(x.equalsIgnoreCase("higher")){
				left=middle+1;
				middle=(left+right)/2;
				System.out.print(array[middle]);
				System.out.print("- is this your number?");
				System.out.println();
				x=scan.nextLine();
			}
			if(x.equalsIgnoreCase("yes")){
				break;
			}
			if(x.equalsIgnoreCase("lower")){
				right=middle-1;
				middle=(left+right)/2;
				System.out.print(array[middle]);
				System.out.print("- is this your number?");
				System.out.println();
				x=scan.nextLine();
				
			}
		}
		
			System.out.println(array[middle] +" е числото");
		
	}

}
