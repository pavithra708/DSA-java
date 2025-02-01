import java.util.HashMap;

public class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int k) {
        // HashMap to store the frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // There's one way to get a sum of 0 (no elements selected)
        
        int currentSum = 0;
        int result = 0;

        // Traverse the array
        for (int num : nums) {
            currentSum += num;  // Update the running sum

            // If (currentSum - k) is in the prefixSumCount, it means we've found a subarray
            if (prefixSumCount.containsKey(currentSum - k)) {
                result += prefixSumCount.get(currentSum - k);
            }

            // Add the current running sum to the hashmap
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        BinarySubarrayWithSum solution = new BinarySubarrayWithSum();
        int[] nums = {1, 0, 1, 0, 1};
        int k = 2;
        int result = solution.numSubarraysWithSum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
