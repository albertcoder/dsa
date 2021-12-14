class Solution {
    public int search(int[] array, int target) {
        		int mid;   // Write your code here.
		int left = 0;
		int right = array.length - 1; 
		while (left <= right) {
			mid = (left + right)/2;
			if (target > array[right]) return -1;
			if (array[mid] == target) return mid;
			if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
    return -1;
    }
}