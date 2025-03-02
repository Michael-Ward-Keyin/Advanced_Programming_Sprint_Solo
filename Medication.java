/**
 * Represents a medication has the ID, name, dose, quantity and expiry date.
 * 
 */
public class Medication {
    private String id; // identifier for medication
    private String name; //name of medication
    private String dose; //dosage of medication
    private int quantityInStock; //Quantity on hand
    private long expiryDate; //Expiry date of medication

    /**
     * Constructs the medication object
     * 
     * @param id
     * @param name
     * @param dose
     * @param quantityInStock
     */
    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = System.currentTimeMillis() + (long)(Math.random() * 5L * 365L * 24L * 60L * 60L * 1000L); // Random expiry date within 5 years
    }

    /**
     * Sets the medication name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the medication dose
     * 
     * @param dose
     */
    public void setDose(String dose) {
        this.dose = dose;
    }

    /**
     * Sets the quantity
     * 
     * @param quantityInStock
     */
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    /**
     * gets the name
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the dose
     * 
     * @return
     */
    public String getDose() {
        return this.dose;
    }

    /**
     * Gets the quantity
     * 
     * @return
     */
    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    /**
     * Gets the ID
     * 
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the expiry date
     * 
     * @return
     */
    public long getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Makes a string to represent the medication.
     * 
     * 
     */
    @Override
    public String toString() {
        return "Medication ID: " + this.id + ", Name: " + this.name + ", Dose: " + this.dose + ", Quantity in Stock: " + this.quantityInStock + ", Expiry Date: " + new java.util.Date(this.expiryDate);
    }
}
