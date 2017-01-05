import java.util.*;

public class IntToString {

	public static void main(String[] args) {
		
		System.out.print("Enter the integer you want to convert into String: ");
		Scanner obj = new Scanner(System.in);
		int no = obj.nextInt();
		
		String noString = Integer.toString(no);
		
		System.out.println("String is : "+noString);
	}
}