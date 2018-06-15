import javax.swing.*;

public class PracticeClass {

	public static void main(String[] args) {
		
		//Initiate the array with some names.
		String[] arr = {"Trevor", "Erin", "Jonathan", "Phill", "Josh", "Bob"};
		
		//Creates JFrame object
		JFrame input = new JFrame();
		//Displays a message to the user for input.
		String name = JOptionPane.showInputDialog(input, "Enter name: ");
		
		int i = 0;
		boolean found = false;
		
		//Iterates through the array looking for the users input.
		for( ; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		//Short-hand if-then-else
		System.out.println(found? "Yes, " + name + " is in this array at index " + i + "!" : "No, " + name + " is not in this array.");
		
//		String addText = JOptionPane.showInputDialog(input, "Would you like to add the name?");
//		
//		if(addText.equals("yes")) {
//			String addName = JOptionPane.showInputDialog(input, "What's the name you'd like to add?");
//			
//			}
	}
}