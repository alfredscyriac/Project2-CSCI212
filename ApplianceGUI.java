import javax.swing.*;
import java.awt.*;
public class ApplianceGUI {
    public ApplianceGUI(SortedApplianceList refrigerators, SortedApplianceList dishwashers, SortedApplianceList microwaves){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(1, 3)); 
        frame.setTitle("Project 2 - Appliance List w Linked Lists");

        JTextArea fridgeArea = new JTextArea();
        ApplianceNode current = refrigerators.head;
        while (current != null){
            fridgeArea.append(current.data.toString() + "\n");
            current = current.next;
        }
        frame.add(new JScrollPane(fridgeArea));

        JTextArea dishWasherArea = new JTextArea();
        ApplianceNode current2 = dishwashers.head; 
        while(current2 != null){
            dishWasherArea.append(current2.data.toString()+"\n");
            current2 = current2.next; 
        }
        frame.add(new JScrollPane(dishWasherArea));
    }
    
}
