public class Project2 {
    public static void main(String[] args) {
        SortedApplianceList applianceList = new SortedApplianceList();
        TextFileInput fileInput = new TextFileInput("p2input.txt");
        String line;
        while ((line = fileInput.readLine()) != null) {
            String[] parts = line.split(",");
            String serial = parts[0];
            double price = Double.parseDouble(parts[1]);
        }
    }
}
