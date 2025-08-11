package lab31_july;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonrepeatingchar {
    public static void main(String[] args) {
        String str = "programming";

        // Use LinkedHashMap to preserve insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeating characters
        System.out.print("Non-repeating characters: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
