public class CountNiceSubarrays {
    // Helper function to count subarrays with at most k odd numbers
    public int atMostK(int[] nums, int k) {
        int start = 0, oddCount = 0, result = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {  // If the number is odd
                oddCount++;
            }
            
            // Shrink the window from the left if odd count exceeds k
            while (oddCount > k) {
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }
            
            // Count all subarrays ending at 'end' and starting from 'start' to 'end'
            result += (end - start + 1);
        }
        
        return result;
    }
    
    public int countNiceSubarrays(int[] nums, int k) {
        // Count the subarrays with at most k odd numbers minus those with at most k-1 odd numbers
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    public static void main(String[] args) {
        CountNiceSubarrays solution = new CountNiceSubarrays();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        int result = solution.countNiceSubarrays(nums, k);
        System.out.println("Number of nice subarrays with at most " + k + " odd numbers: " + result);
    }
}
