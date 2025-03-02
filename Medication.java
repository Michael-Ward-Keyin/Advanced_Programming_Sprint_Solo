public class Medication {
    private String id;
    private String name;
    private String dose;
    private int quantityInStock;
    private long expiryDate; 


    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = System.currentTimeMillis() + (long)(Math.random() * 5L * 365L * 24L * 60L * 60L * 1000L); // Random expiry date within 5 years
    }

 
    public void setName(String name) {
        this.name = name;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return this.name;
    }

    public String getDose() {
        return this.dose;
    }

    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public String getId() {
        return this.id;
    }

    public long getExpiryDate() {
        return this.expiryDate;
    }

    @Override
    public String toString() {
        return "Medication ID: " + this.id + ", Name: " + this.name + ", Dose: " + this.dose + ", Quantity in Stock: " + this.quantityInStock + ", Expiry Date: " + new java.util.Date(this.expiryDate);
    }
}
