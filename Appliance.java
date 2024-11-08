public abstract class Appliance {
    /**
     * Private instance variable for the serial number that uniquely identifies this appliance
     */
    private String serialNumber; 
    
    /**
     * Constructs an Appliance with the specified serial number.
     * @param serialNumber the unique serial number of the appliance
     */
    public Appliance (String serialNumber) {  
        this.serialNumber = serialNumber;
    }

    /**
     * Returns the serial number of the appliance this method is used on
     */
    public String getSerialNumber () {  
        return serialNumber;
    }

    /**
     * This method sets the serial number of an appliance using the string parameter passed in
     * @param serialNumber the new serial number for this appliance
     */
    public void setSerialNumber (String serialNumber) {  
        this.serialNumber = serialNumber;
    }

    /**
     * Returns the type of this appliance by checking the first char in string
     * @return a char which is the first character of the serial number
     */
    public char getApplianceType () {   
        return serialNumber.charAt(0);  
    }

    /**
     * Returns a string which is serial number 
     * toString is used in Dishwasher.java, Microwave.java, Refrigerator.java, and ApplianceGUI.java
     * @return the serial number as a String
     */
    public String toString() { 
        return serialNumber;
    }

    /**
     * Compares an appliance's serial number with another appliance's serial number.
     * @param other the other Appliance to compare with
     * @return a negative integer, zero, or a positive integer as this serial number is
     * less than, equal to, or greater than the specified appliance's serial number
     */
    public int compareTo (Appliance other) {  // Compare two serial numbers to help order them numerically later on
        return this.serialNumber.compareTo(other.serialNumber);
    }

    /**
     * Checks an appliance has the same serial number as another appliance
     * @param other the reference Appliance to compare with
     * @return true if the specified appliance has the same serial number, false otherwise
     */
    public boolean equals (Appliance other) {
        return this.serialNumber.equals(other.serialNumber); // boolean to check if two serial numbers are equal, passing the compared serial number as a parameter
    }
}
