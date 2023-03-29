public class HydrogenCombustion extends CombustionMotor{
    protected boolean biFuel;
    protected int hydrogenEfficiency, gasEfficiency;

    public HydrogenCombustion() {
        biFuel = false;
        hydrogenEfficiency = 0;
        gasEfficiency = 0;
    }

    public HydrogenCombustion(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction, double displacement, int cylinders,
            boolean biFuel, int hydrogenEfficiency, int gasEfficiency) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, displacement,
                cylinders);
        this.biFuel = biFuel;
        this.hydrogenEfficiency = hydrogenEfficiency;
        this.gasEfficiency = gasEfficiency;
    }

    public boolean isBiFuel() {
        return biFuel;
    }

    public void setBiFuel(boolean biFuel) {
        this.biFuel = biFuel;
    }
    
    public int getHydrogenEfficiency() {
        return hydrogenEfficiency;
    }

    public void setHydrogenEfficiency(int hydrogenEfficiency) {
        this.hydrogenEfficiency = hydrogenEfficiency;
    }

    public int getGasEfficiency() {
        return gasEfficiency;
    }
    
    public void setGasEfficiency(int gasEfficiency) {
        this.gasEfficiency = gasEfficiency;
    }
    
    @Override
    public String toString() {
        return "HydrogenCombustion [biFuel=" + biFuel + ", hydrogenEfficiency=" + hydrogenEfficiency
                + ", gasEfficiency=" + gasEfficiency + "]";
    }
    
    @Override
    public String formatEngine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatEngine'");
    }
    
    @Override
    public String formatEfficiency() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatEfficiency'");
    }
    
    @Override 
    public void displayInfo() {
        
    }
}
