import java.util.HashMap;

public class TwoNumber {
 
	public int[] twoIndices(int[] nums, int target) {
		
		// Map hold the values for tracking
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        
        int len = nums.length;
        
        for(int i = 0; i < len; i++){
        	// this logic executes when number exist in the map.
            if(tracker.containsKey(nums[i])){
            	// return the position of the existing number in the map
                int left = tracker.get(nums[i]);
                System.out.println("The left:"+left);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
	public static void main(String args[]) {
		
		int[] nums = {2,7,11,15};
	    int target = 18;
	   
		TwoNumber ex = new TwoNumber();
		int[] result = ex.twoIndices(nums,target);
		
		System.out.println(result[0]+" "+result[1]);
		
	}
}