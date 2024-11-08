// Author: Alfred Siby Cyriac
// CSCI212 Lab Section: 121E
public class Project2 {
    public static void main(String[] args) {
        // Create a Sorted Link List for each appliance type 
        // Used TextFileInput.java to read in p2input.txt and stored the parsed values into these 
        // These sorted linked lists will be used in our GUI
        SortedApplianceList refrigerators = new SortedApplianceList();
        SortedApplianceList dishwashers = new SortedApplianceList();
        SortedApplianceList microwaves = new SortedApplianceList();
        
        // We read in the text from p2input.txt until we reach a line that is null
        // For each line that is read, .split is used to seperate the 3 sections -- this can be done (continued)
        // (continued) using regex patterns but i opted for .split() after reading documentation online
        // .split() generates a string array where index 0 holds the serial number, index 1 holds price (continued)
        // (continued) index 2 holds a unqiue element to each appliance type
        // Double.parseDouble and Integer.parseInt are used to convert strings to the proper data type for parameters
        // We are identifying what kind of appliance it is by checking the first char in the serial number string
        // Once the appliance type is identified, the .add method from the SortedApplianceList class is used (contiued)
        // (continued) to add a node to the before created SortedApplianceLists 
        TextFileInput fileInput = new TextFileInput("p2input.txt");
        String line;
        while ((line = fileInput.readLine()) != null) {
            String[] parts = line.split(",");
            String serial = parts[0];
            double price = Double.parseDouble(parts[1]);
            if(parts[0].charAt(0) == 'R'){
                int cubic_feet = Integer.parseInt(parts[2]);
                refrigerators.add(new Refrigerator(serial, price, cubic_feet));
            }
            else if(parts[0].charAt(0)=='M'){
                int watts = Integer.parseInt(parts[2]);
                microwaves.add(new Microwave(serial, price, watts));
            }
            else if(parts[0].charAt(0)=='D'){
                boolean undercounterInstallation = parts[2].equalsIgnoreCase("Y");
                dishwashers.add(new Dishwasher(serial, price, undercounterInstallation));
            }
        }
        // Once the while loop ends and we reach a null value in the .txt file we end reading in
        fileInput.close();

        // At this point, since we have 3 sorted appliance lists, we pass them into our GUI for it to (continued)
        // (conitied) be outputed to the screen in its specific column 
        new ApplianceGUI(refrigerators, dishwashers, microwaves);
    }
}
