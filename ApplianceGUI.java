import javax.swing.*;
import java.awt.*;
public class ApplianceGUI {
    public ApplianceGUI(SortedApplianceList refrigerators, SortedApplianceList dishwahsers, SortedApplianceList microwaves){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(1, 3)); 
        frame.setTitle("Project 2 - Appliance List w Linked Lists");
    }
    
}
