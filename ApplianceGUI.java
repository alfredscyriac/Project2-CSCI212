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
            fridgeArea.append(current.toString() + "\n");
            current = current.next;
        }
        frame.add(new JScrollPane(fridgeArea));

        JTextArea dishWasherArea = new JTextArea();
        ApplianceNode current2 = dishwashers.head; 
        while(current2 != null){
            dishWasherArea.append(current2.toString()+"\n");
            current2 = current2.next; 
        }
        frame.add(new JScrollPane(dishWasherArea));

        JTextArea microwaveArea = new JTextArea();
        ApplianceNode current3 = microwaves.head;
        while(current3 != null){
            microwaveArea.append(current3.toString() + "\n");
            current3=current3.next;
        }
        frame.add(new JScrollPane(microwaveArea));

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
    
}
