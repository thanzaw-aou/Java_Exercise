import java.util.Scanner;

public class ExerciseSix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Input a positive integer: ");
		  int n = scanner .nextInt();
		  
		  int result = (n * (n + 1) / 2) * (1 << (n - 1));
		  System.out.print("Sum of subsets of n is : " + result);

	}

}
