class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0; // Use long to avoid integer overflow
        for (int num : nums) {
            totalSum += num;
        }

        long targetSum = totalSum % p;
        if (targetSum == 0) {
            return 0; // The entire array is already divisible by p
        }

        Map<Long, Integer> prefixSumToIndex = new HashMap<>();
        prefixSumToIndex.put(0L, -1); // Initialize with a prefix sum of 0 at index -1
        long currentPrefixSum = 0;
        int minSubarrayLength = n;

        for (int i = 0; i < n; i++) {
            currentPrefixSum += nums[i];
            long remainder = currentPrefixSum % p;
            long neededPrefixSum = (remainder - targetSum + p) % p;

            if (prefixSumToIndex.containsKey(neededPrefixSum)) {
                int subarrayLength = i - prefixSumToIndex.get(neededPrefixSum);
                minSubarrayLength = Math.min(minSubarrayLength, subarrayLength);
            }

            prefixSumToIndex.put(currentPrefixSum % p, i);
        }

        return minSubarrayLength == n ? -1 : minSubarrayLength;
    }
}