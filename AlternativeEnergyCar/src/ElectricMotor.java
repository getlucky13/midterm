public class ElectricMotor extends AEC{
    int maxRange;

    public ElectricMotor() {
            maxRange = 0;
    }

    public ElectricMotor(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction, int maxRange) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction);
        this.maxRange = maxRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }
    
    @Override
    public String toString() {
        return "Electric Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + power + " horsepower. " + "Max range of " + this.maxRange + " miles."
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }    
    
    @Override
    public void displayInfo() {
        System.out.println("Alternative Energy Car");
        System.out.println(this.carNameToString());
        System.out.println(formattedPrice() + " new");
        System.out.println(doors + " door " + layout + " " + style);
        System.out.println("Max range: " + maxRange + " miles");
        System.out.println("Product of " + country);
        System.out.println(this.inProductionToString());
    }
}
