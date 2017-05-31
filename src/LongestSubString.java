import java.util.HashSet;
import java.util.Set;


public class LongestSubString {

	public static String lengthOfLongestSubstring(String s) {
	    int j = 0 ;
	    	    
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	        } 
	    }
	    System.out.println("Result iss"+set.toString());
	    return set.toString();
	}
	
	public static void main(String[] args) {
		
		String example = "aaaaaabbbbcca";
		lengthOfLongestSubstring(example);

	}

}
