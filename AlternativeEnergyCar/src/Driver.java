public class Driver {
    public static void main(String[] args) throws Exception {
        AEC greyFox = new AEC(2005, 5, 250, 24545.00, "Subaru", 
        "Impreza WRX", "Japan", "Hatchback", "AWD", false);

        String info = greyFox.toString();
        System.out.println(info);
        greyFox.displayInfo();
    }
}
