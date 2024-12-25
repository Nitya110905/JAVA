package Assignment_1;
import java.util.HashMap;
import java.util.Map;

public class Q0019_Frequent_Character {
	public static void main(String[] args) {
		        String input = "successes";
		        System.out.println("The given string is: " + input);
		        System.out.println("The second most frequent character in the string is: " + findSecondMostFrequentChar(input));
		    }

		    public static char findSecondMostFrequentChar(String input) {
		        // Create a frequency map to store the frequency of each character
		        Map<Character, Integer> frequencyMap = new HashMap<>();

		        // Iterate over the string and update the frequency map
		        for (char c : input.toCharArray()) {
		            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		        }

		        // Find the most frequent character
		        char mostFrequentChar = 0;
		        int maxFrequency = 0;
		        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
		            if (entry.getValue() > maxFrequency) {
		                maxFrequency = entry.getValue();
		                mostFrequentChar = entry.getKey();
		            }
		        }

		        // Remove the most frequent character from the frequency map
		        frequencyMap.remove(mostFrequentChar);

		        // Find the second most frequent character
		        char secondMostFrequentChar = 0;
		        int secondMaxFrequency = 0;
		        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
		            if (entry.getValue() > secondMaxFrequency) {
		                secondMaxFrequency = entry.getValue();
		                secondMostFrequentChar = entry.getKey();
		            }
		        }

		        return secondMostFrequentChar;
		

	}
}
