class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        return new int[]{first, last};
    }

    public int search(int[] nums, int target, boolean findFirst) {
        int s = 0, e = nums.length - 1, ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) e = mid - 1;
                else s = mid + 1;
            }
            else if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return ans;
    }
}