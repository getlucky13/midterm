import java.nio.file.attribute.FileAttribute;

public class Driver {
    public static void main(String[] args) throws Exception {
        HydrogenElectric mirai = new HydrogenElectric(2020, 4, 136, 65000.00, "Toyota",
        "Mirai", "Japan", "Sedan", "Front motor, front wheel drive", true, 
        402, "Gas", 5.0, true);

        SolarElectric aptera = new SolarElectric(2024, 3, 126, 47000.00, "Aptera Motors", 
        "Aptera Solar EV", "United States", "Hatchback Coupe", "AWD", 
        false, 1000, 100, "Three electric wheel hub motors", 25, true);

        HydrogenCombustion rx8 = new HydrogenCombustion(2006, 4, 80, 0, "Mazda", "RX-8 HRE", 
        "Japan", "Quad coupe", "Front mid engine, RWD", false, 1.3, 2, 
        true, 26, 20);

        EthanolCombustion fiat147 = new EthanolCombustion(1979, 3, 60, 3800.0, "Fiat", "147", 
        "Brazil", "Hatchback", "FWD", false, 1.3, 4, 100, 
        false, true, false, 0, 18);

        
    }
}
