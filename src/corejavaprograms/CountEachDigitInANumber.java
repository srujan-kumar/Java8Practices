package corejavaprograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachDigitInANumber {
    public static void main(String[] args) {
        digitCount(1238923626);
    }

    public static void digitCount(long number) {
        Map<Long, Integer> digitMap = new HashMap<Long, Integer>();
        while (number != 0) {
            long lastDigit = number % 10;
            if (digitMap.containsKey(lastDigit)) {
                digitMap.put(lastDigit, digitMap.get(lastDigit) + 1);
            } else {
                digitMap.put(lastDigit, 1);
            }
            number = number / 10;
        }
        System.out.println("Digits Count" + digitMap);

    }


}
