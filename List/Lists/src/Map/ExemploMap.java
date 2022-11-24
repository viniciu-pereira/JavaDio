package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    
    public static void main(String[] args) {
        

        System.out.println("");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("onix", 16.4);
            put("hr-v", 20.2);
        }};
        System.out.println(carrosPopulares.toString());

        carrosPopulares.put("gol", 20.5);
        System.out.println("Novo valor "  +  carrosPopulares.toString());

        System.out.println("Tucson, está na lista?: " + carrosPopulares.containsKey("Tucson"));
    }
}
