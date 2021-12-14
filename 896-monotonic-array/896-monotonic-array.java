class Solution {
    public boolean isMonotonic(int[] array) {
        		if (array.length == 0 || array == null || array.length == 1) {
			return true;
		}
    // Write your code here.
		int x = 0;
		int y = x+1;
		boolean up = false;
		boolean down = false;
		while (x <= array.length - 2 && y <= array.length - 1) {
			if (array[x] == array[y]) {
				x++;
				y++;
			} else if (array[x] < array[y]) {
				up = true;
				break;
			} else if (array[x] > array[y]) {
				down = true;
				break;
			}
		}
		x = 0;
		y = x +1;
		if (up) {
			while (x <= array.length - 2 && y <= array.length - 1) {
				if (array[x] > array[y]) {
					return false;
				}
				x++;
				y++;
			}
		} else {
				while (x <= array.length - 2 && y <= array.length - 1) {
					if (array[x] < array[y]) {
						return false;
				}
					x++;
					y++;
			}
		}
			
    return true;
    }
}