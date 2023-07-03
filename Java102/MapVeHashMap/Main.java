package Java102.MapVeHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Turkey", "Ankara");
        capitalCities.put("England","London");
        capitalCities.put("Germany", "Berlin");
        System.out.println("size(): "+capitalCities.size());

        System.out.println(capitalCities);

        System.out.println("-------------------------");
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("Germany");
        System.out.println("-------------------------");
        System.out.println(capitalCities);
        System.out.println("-------------------------");
        System.out.println("size(): "+capitalCities.size());
        System.out.println("-------------------------");
        capitalCities.clear();
        System.out.println("size(): "+capitalCities.size());
        System.out.println("-------------------------");
        capitalCities.put("Country1","City1");
        capitalCities.put("Country2","City2");
        for(String i : capitalCities.keySet()){
            System.out.println("Key: "+ i + " Value: "+capitalCities.get(i));
        }
        System.out.println("-------------------------");


    }
}
