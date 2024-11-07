public class Project2 {
    public static void main(String[] args) {
        SortedApplianceList refrigerators = new SortedApplianceList();
        SortedApplianceList dishwashers = new SortedApplianceList();
        SortedApplianceList microwaves = new SortedApplianceList();
        
        TextFileInput fileInput = new TextFileInput("p2input.txt");
        String line;
        while ((line = fileInput.readLine()) != null) {
            String[] parts = line.split(",");
            String serial = parts[0];
            Appliance serial2 = parts[0];
            double price = Double.parseDouble(parts[1]);
            if(serial2.getApplianceType() == 'R'){
                int cubic_feet = Integer.parseInt(parts[2]);
                refrigerators.add(new Refrigerator(serial, price, cubic_feet));
            }
            else if(serial2.getApplianceType()=='M'){
                int watts = Integer.parseInt(parts[2]);
                microwaves.add(new Microwave(serial, price, watts));
            }
            else if(serial2.getApplianceType()=="D"){
                boolean undercounterInstallation = parts[2].equalsIgnoreCase("Y");
                dishwashers.add(new Dishwasher(serial, price, undercounterInstallation));
            }
        }
        fileInput.close();
        new ApplianceGUI(refrigerators, dishwashers, microwaves);

    }
}
