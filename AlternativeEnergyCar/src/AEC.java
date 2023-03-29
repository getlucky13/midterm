import java.lang.Comparable;

public class AEC implements Comparable<AEC> { 
    protected int year, doors, power;
    protected double price;
    protected String manufacturer, model, country, style, layout;
    protected boolean inProduction;

    public AEC() {
        year = 0;
        doors = 0;
        power = 0;
        manufacturer = "NA";
        model = "NA";
        country = "NA";
        style = "NA";
        layout = "NA";
        inProduction = false;
        price = 0.00;
    }
    
    public AEC(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction) {
        this.year = year;
        this.doors = doors;
        this.power = power;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.country = country;
        this.style = style;
        this.layout = layout;
        this.inProduction = inProduction;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    public String carNameToString(){
        return year + " " + manufacturer + " " + model;
    }

    public String inProductionToString(){
        if(inProduction) {
            return "Currently in production.";
        } else {
            return "No longer produced.";
        }
    }

    public String formattedPrice(){ 
        return String.format("$%,.2f new. ", price);
    } 

    @Override
    public String toString() {
        return "Alternative Energy Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + power + " horsepower. " + "Product of " + country + ". " 
        + this.inProductionToString() + " " + formattedPrice();
    }

    public void displayInfo(){
        System.out.println("Alternative Energy Car");
        System.out.println(this.carNameToString());
        System.out.println(formattedPrice() + " new");
        System.out.println(doors + " door " + layout + " " + style);
        System.out.println("Product of " + country);
        System.out.println(this.inProductionToString());
    }

    public int compareTo(AEC input){
        return (int) (this.price - input.price);
    }
}
