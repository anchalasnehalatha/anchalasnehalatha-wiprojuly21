package lab23_july;
import java.util.HashSet;

public class longestuniquesubstring {


	

	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        int maxLength = 0;
	        int left = 0, right = 0;
	        HashSet<Character> seen = new HashSet<>();

	        while (right < n) {
	            if (!seen.contains(s.charAt(right))) {
	                seen.add(s.charAt(right));
	                maxLength = Math.max(maxLength, right - left + 1);
	                right++;
	            } else {
	                seen.remove(s.charAt(left));
	                left++;
	            }
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String input = "abcabcbb";
	        int result = lengthOfLongestSubstring(input);
	        System.out.println("Longest substring without repeating characters = " + result);
	    }
	}



