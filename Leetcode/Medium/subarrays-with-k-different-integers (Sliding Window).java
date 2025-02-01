import java.io.*;
import java.util.*;

public class Solution {
    // Helper function to count subarrays with at most k distinct numbers
    public static int atmost(int arr[], int n, int k) {
        int i = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int j = 0; j < n; j++) {
            // Add current element to the hashmap
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            
            // If the size of the map exceeds k, shrink the window
            while (map.size() > k) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;  // Move start pointer forward
            }
            
            // Count subarrays with the current window size
            ans += (j - i + 1);
        }
        
        return ans;
    }

    // Function to count subarrays with exactly k distinct numbers
    public static int kDiff(int arr[], int n, int k) {
        return atmost(arr, n, k) - atmost(arr, n, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        // Output the result for subarrays with exactly 'target' distinct numbers
        System.out.println(kDiff(arr, n, target));
    }
}
