import javax.swing.*; 
import java.awt.*;
public class ApplianceGUI {
    public ApplianceGUI(SortedApplianceList refrigerators, SortedApplianceList dishwashers, SortedApplianceList microwaves){
        JFrame frame = new JFrame(); // Create our GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed.
        frame.setLayout(new GridLayout(1, 3)); // Creates 3 sections/columns for refrigerators, dishwashers, microwave
        frame.setTitle("Project 2 - Appliance List w Linked Lists"); 

        // Refrigerators section will be the first column
        // A node is created to iterate through the sorted linked list
        // The iteration starts at .head.next because .head is always our dummy node, so by starting (continued)
        // (continued) at the one right after we get the first sorted element 
        // We iterate using .next until our node reaches a null node meaning we've reached the end of the linked list
        // The text shown on the GUI is the toString created for each node in Refrigerator.java 
        // The sorted link lists are populated with data in Project2.java 
        JTextArea fridgeArea = new JTextArea();
        ApplianceNode current = refrigerators.head.next;
        while (current != null){
            fridgeArea.append(current.data.toString() + "\n");
            current = current.next;
        }
        frame.add(new JScrollPane(fridgeArea));

        // Dishwasher section will be the second/ middle column 
        // Logic for this section follows the same as the refrigerators 
        JTextArea dishWasherArea = new JTextArea();
        ApplianceNode current2 = dishwashers.head.next; 
        while(current2 != null){
            dishWasherArea.append(current2.data.toString()+"\n");
            current2 = current2.next; 
        }
        frame.add(new JScrollPane(dishWasherArea));

        // Microwave section will be the third/last column 
        // Logic for this section follows the same as the refrigerators 
        JTextArea microwaveArea = new JTextArea();
        ApplianceNode current3 = microwaves.head.next;
        while(current3 != null){
            microwaveArea.append(current3.data.toString() + "\n");
            current3=current3.next;
        }
        frame.add(new JScrollPane(microwaveArea));

        // Display the GUI frame and setting its size
        frame.setSize(900, 400);
        frame.setVisible(true);
    }
    
}
