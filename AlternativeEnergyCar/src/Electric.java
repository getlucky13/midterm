public class Electric extends AEC{
    int maxRange;

    public Electric() {
            
    }

    public Electric(int year, int doors, int power, double price, String manufacturer, String model,
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
        + layout + " " + style + ", " + power + " horsepower. " + "Max range of " + this.maxRange
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }
}
