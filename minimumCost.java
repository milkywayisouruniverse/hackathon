import java.util.Arrays;

class Solution {
    public int minimumCost(int[] nums, int k, int dist) {
        // nums[0] is always included
        int cost = nums[0];

        // Collect candidates within allowed distance
        int[] candidates = new int[dist + 1];
        for (int i = 0; i <= dist; i++) {
            candidates[i] = nums[i + 1];
        }

        // Sort candidates
        Arrays.sort(candidates);

        // Add smallest (k - 1) elements
        for (int i = 0; i < k - 1; i++) {
            cost += candidates[i];
        }

        return cost;
    }
}

