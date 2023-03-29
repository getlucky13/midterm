public abstract class ElectricMotor extends AEC{
    protected int maxRange;
    protected double capacity;

    public ElectricMotor() {
            maxRange = 0;
            capacity = 0.0;
    }

    public ElectricMotor(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction, int maxRange, double capacity) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction);
        this.maxRange = maxRange;
        this.capacity = capacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public abstract String formatCapacity();
    public abstract String formatPower();
    
    @Override
    public String toString() {
        return "Electric Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + power + " horsepower. " + "Max range of " + this.maxRange + " miles."
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }    
    
    @Override
    public void displayInfo() {
        System.out.println("Electric Motor Car");
        System.out.println(this.carNameToString());
        System.out.println(formattedPrice());
        System.out.println(doors + " door " + layout + " " + style);
        System.out.println(this.formatPower() + this.formatCapacity());
        System.out.println("Max range: " + maxRange + " miles");
        System.out.println("Product of " + country);
        System.out.println(this.inProductionToString());
    }
}
