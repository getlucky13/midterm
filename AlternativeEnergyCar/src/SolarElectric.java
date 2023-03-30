public class SolarElectric extends ElectricMotor{
    protected String engineFormat;
    protected double cellEfficiency;
    protected boolean roadLegal;
    public SolarElectric() {
        engineFormat = "NA";
        cellEfficiency = 0.00;
        roadLegal = false;
    }

    public SolarElectric(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction, int maxRange, double capacity,
            String engineFormat, double cellEfficiency, boolean roadLegal) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, maxRange, capacity);
        this.engineFormat = engineFormat;
        this.cellEfficiency = cellEfficiency;
        this.roadLegal = roadLegal;
    }

    public String getEngineFormat() {
        return engineFormat;
    }

    public void setEngineFormat(String engineFormat) {
        this.engineFormat = engineFormat;
    }

    public double getCellEfficiency() {
        return cellEfficiency;
    }

    public void setCellEfficiency(double cellEfficiency) {
        this.cellEfficiency = cellEfficiency;
    }

    public boolean isRoadLegal() {
        return roadLegal;
    }

    public void setRoadLegal(boolean roadLegal) {
        this.roadLegal = roadLegal;
    }

    public String roadLegalFormat() {
        return "SolarElectric roadLegalFormat";
    }

    @Override
    public String toString() {
        return "SolarElectric [engineFormat=" + engineFormat + ", cellEfficiency=" + cellEfficiency + ", roadLegal="
                + roadLegal + "]";
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

    @Override
    public String formatCapacity() {
        return capacity + " kWh battery with a %" + cellEfficiency + " cell efficiency." ;
    }

    @Override
    public String formatPower() {
        return "SolarElectric formatPower";
    }
}
