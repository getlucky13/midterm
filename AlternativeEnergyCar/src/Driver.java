import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        HydrogenElectric mirai = new HydrogenElectric(2020, 4, 136, 65000.00, "Toyota",
        "Mirai", "Japan", "Sedan", "Front motor, front wheel drive", true, 
        402, "Gaseous Hydrogen", 5.0, true);

        SolarElectric aptera = new SolarElectric(2024, 3, 126, 47000.00, "Aptera Motors", 
        "Aptera Solar EV", "United States", "Hatchback Coupe", "AWD", 
        false, 1000, 100, "Three electric wheel hub motors", 25, 
        true);

        HydrogenCombustion rx8 = new HydrogenCombustion(2006, 4, 80, 0, "Mazda", "RX-8 HRE", 
        "Japan", "Quad coupe", "Front mid engine, RWD", false, 1.3, 2, 
        true, 26, 20);

        EthanolCombustion fiat147 = new EthanolCombustion(1979, 3, 60, 3800.0, "Fiat", "147", 
        "Brazil", "Hatchback", "FWD", false, 1.3, 4, 100, 
        false, true, false, 0, 18);

        AEC miraiAEC = mirai;
        AEC apteraAEC = aptera;
        AEC rx8AEC = rx8;

        ArrayList<AEC> polymorphicTest = new ArrayList<>();
        polymorphicTest.add(rx8AEC);
        polymorphicTest.add(apteraAEC);
        polymorphicTest.add(miraiAEC);

        System.out.println("---Alternative Energy Cars: polymorphicTest---");
        for(AEC car: polymorphicTest) {
            car.displayInfo();
            System.out.println();
        }

        ArrayList<AEC> comparableTest = new ArrayList<>();
        comparableTest.add(aptera);
        comparableTest.add(rx8);
        comparableTest.add(mirai);
        comparableTest.add(fiat147);
        
        System.out.println("---Alternative Energy Cars: comparableTest Unsorted---");
        for(AEC car: comparableTest) {
            car.displayInfo();
            System.out.println();
        }

        Collections.sort(comparableTest);

        System.out.println("---Alternative Energy Cars: comparableTest Sorted by Price---");
        for(AEC car: comparableTest){
            System.out.println(car.carNameToString());
            System.out.println(car.formattedPrice());
            System.out.println();
        }
    }
}
