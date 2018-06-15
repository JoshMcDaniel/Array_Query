import java.util.Scanner;

public class PracticeClass {

	public static void main(String[] args) {
		
		String[] arr = {"Trevor", "Erin", "Jonathan", "Phill", "Josh", "Bob"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		
		String name = input.nextLine();
		int i = 0;
		boolean found = false;
		
		for( ; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				found = true;
				break;
			}
		}		
		input.close();
		System.out.println(found? "Yes, " + name + " is in this array at index " + i + "!" : "No, " + name + " is not in this array.");
		
	}
}
	
