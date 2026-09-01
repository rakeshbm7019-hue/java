import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    private static final Map<Integer, String> romanNumerals = new HashMap<>();

    static {
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        
        for (int value : new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}) {
            while (num >= value) {
                num -= value;
                result.append(romanNumerals.get(value));
            }
        }
        
        return result.toString();
    }
}