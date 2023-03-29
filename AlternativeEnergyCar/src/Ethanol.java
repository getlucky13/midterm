public class Ethanol extends CombustionMotor{
    protected int ethanolPercent;
    protected boolean hasDualTanks, takesE100, canFlex;

    public Ethanol() {
        ethanolPercent = 0;
        hasDualTanks = false;
        takesE100 = false;
        canFlex = false;
    }

    public Ethanol(int year, int doors, int power, double price, String manufacturer, String model, String country,
            String style, String layout, boolean inProduction, double displacement, int cylinders, int ethanolPercent,
            boolean hasDualTanks, boolean takesE100, boolean canFlex) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, displacement,
                cylinders);
        this.ethanolPercent = ethanolPercent;
        this.hasDualTanks = hasDualTanks;
        this.takesE100 = takesE100;
        this.canFlex = canFlex;
    }

    public int getEthanolPercent() {
        return ethanolPercent;
    }

    public void setEthanolPercent(int ethanolPercent) {
        this.ethanolPercent = ethanolPercent;
    }

    public boolean isHasDualTanks() {
        return hasDualTanks;
    }

    public void setHasDualTanks(boolean hasDualTanks) {
        this.hasDualTanks = hasDualTanks;
    }

    public boolean isTakesE100() {
        return takesE100;
    }

    public void setTakesE100(boolean takesE100) {
        this.takesE100 = takesE100;
    }    

    public boolean isCanFlex() {
        return canFlex;
    }

    public void setCanFlex(boolean canFlex) {
        this.canFlex = canFlex;
    }

    public String formatFuelInfo(){
        return "Test";
    }

    @Override
    public String toString() {
        return "Ethanol [ethanolPercent=" + ethanolPercent + ", hasDualTanks=" + hasDualTanks + ", takesE100="
                + takesE100 + "]";
    }

    @Override
    public String formatEngine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatEngine'");
    }

    @Override
    public void displayInfo(){
        
    }


}