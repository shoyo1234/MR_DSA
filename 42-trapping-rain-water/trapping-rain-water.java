class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lm = 0, rm = 0, tw = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lm)
                    lm = height[l];
                else
                    tw += lm - height[l];

                l++;
            } else {
                if (height[r] >= rm)
                    rm = height[r];
                else
                    tw += rm - height[r];

                r--;
            }
        }

        return tw;
    }
}