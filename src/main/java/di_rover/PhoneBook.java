package di_rover;

import java.util.HashMap;

public class PhoneBook {

    HashMap<Integer, String> numbers = new HashMap<Integer, String>();

    public int add(int number, String name) {

        if (!numbers.containsKey(number) && !numbers.containsValue(name)) {
            numbers.put(number, name);
        }

        return numbers.size();
    }

    public String findByNumber(int number) {
        return null;
    }
}
