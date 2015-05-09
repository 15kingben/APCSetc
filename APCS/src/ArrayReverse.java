import java.util.Scanner;


public class ArrayReverse {
	public static void main(String args[]){
		System.out.print("Enter the number of values in the array");
		Scanner in = new Scanner(System.in);
		//Get input
		int numvals = in.nextInt();
		int[] vals = new int[numvals];
		for(int i = 0; i < numvals; i++){
			vals[i] = in.nextInt();
		}
		int tempInt;
		int last = numvals - 1;
		for(int i = 0; i < ((float)(numvals))/2; i++){
			tempInt = vals[i];
			vals[i] = vals[last - i];
			vals[last - i] = tempInt;
		}
		for(int i : vals){
			System.out.print(i + " ");
		}
	}
}
