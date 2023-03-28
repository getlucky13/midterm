public class Driver {
    public static void main(String[] args) throws Exception {
        int[] mpg = {20, 27};
        AEC greyFox = new AEC(mpg, 2005, 5, 250, 24545.00, "Subaru", 
        "Impreza WRX", "Japan", "Hatchback", "AWD", false);

        String info = greyFox.toString();
        System.out.println(info);
        greyFox.displayInfo();
    }
}
