package JavaTests;

import java.util.*;
public class Test6 {
	    private static void generatePermutationsHelper(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used) {
	        if (current.size() == nums.length) {
	            result.add(new ArrayList<>(current));
	            return;
	        }
	        
	        for (int i = 0; i < nums.length; i++) {
	            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
	                continue;
	            }
	            
	            current.add(nums[i]);
	            used[i] = true;
	            generatePermutationsHelper(result, current, nums, used);//recursion
	            used[i] = false;
	            current.remove(current.size() - 1);
	        }
	    }
	    public static List<List<Integer>> generatePermutations(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(nums);
	        generatePermutationsHelper(result, new ArrayList<>(), nums, new boolean[nums.length]);
	        return result;
	    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        
        List<List<Integer>> permutations = generatePermutations(nums);
        
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
    
   
}
