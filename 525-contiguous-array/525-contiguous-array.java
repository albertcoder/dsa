class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr == 0) {
                rSum -= 1;
            } else {
                rSum += 1;
            }
            if (!map.containsKey(rSum)) {
                map.put(rSum, i);
            } else {
                max = Math.max(max, i - map.get(rSum));
            }
        }
        return max;
    }
}