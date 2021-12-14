class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //right pass
        int runningRightProduct = 1;
        int i = 0;
        while (i < nums.length) {
            if (i == 0) {
                result[i] = runningRightProduct;
            } else {
                runningRightProduct = nums[i-1] * runningRightProduct;
                result[i] = runningRightProduct;
            }
            i++;
        }
        //left pass
        runningRightProduct = 1;
        i = nums.length - 1;
        while (i >= 0) {
            if (i != nums.length - 1) {
                runningRightProduct = nums[i+1] * runningRightProduct;
                result[i] = result[i] * runningRightProduct;
            }
            i--;
        }
        System.out.print(Arrays.toString(result));
        return result;
    }
}