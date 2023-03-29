public abstract class CombustionMotor extends AEC{
    protected double displacement;
    protected int cylinders;
    public CombustionMotor() {
        this.displacement = 0.0;
        this.cylinders = 0;
    }

    public CombustionMotor(int year, int doors, int power, double price, String manufacturer, String model,
            String country, String style, String layout, boolean inProduction, double displacement, int cylinders) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction);
        this.displacement = displacement;
        this.cylinders = cylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public abstract String formatEngine();


    @Override
    public String toString() {
        return "CombustionMotor [displacement=" + displacement + ", cylinders=" + cylinders + "]";
    }
    
    @Override
    public void displayInfo(){

    }
    
}
