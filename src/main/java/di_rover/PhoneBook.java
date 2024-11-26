package di_rover;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public HashMap<Integer, String> numbers = new HashMap<Integer, String>();
    private Map<String, Integer> reverseMap = new HashMap<>();

    public int add(int number, String name) {

        if (!numbers.containsKey(number) && !numbers.containsValue(name)) {
            numbers.put(number, name);
            reverseMap.put(name, number);
        }

        return numbers.size();
    }

    public String findByNumber(int number) {
        return numbers.get(number);
    }

    public Integer findByName(String name) {
        return reverseMap.get(name);
    }
}
