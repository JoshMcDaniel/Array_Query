import javax.swing.*;

public class PracticeClass {

	public static void main(String[] args) {
		
		String[] arr = {"Trevor", "Erin", "Jonathan", "Phill", "Josh", "Bob"};
		
		JFrame input = new JFrame();
		String name = JOptionPane.showInputDialog(input, "Enter name: ");
		
		int i = 0;
		boolean found = false;
		
		for( ; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				found = true;
				break;
			}
		}		
		System.out.println(found? "Yes, " + name + " is in this array at index " + i + "!" : "No, " + name + " is not in this array.");
		
	}
}