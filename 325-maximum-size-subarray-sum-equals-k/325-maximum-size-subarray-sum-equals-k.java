class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            rSum += curr;
            if (!map.containsKey(rSum)) {
                map.put(rSum, i);
            }
            if (map.containsKey(rSum - k)) {
                max = Math.max(max, i - map.get(rSum - k));
            }

        }
        return max;
    }
}