class Solution {

    public static int[] twoSum(int[] nums, int target) {

        int i = 0;

        Map < Integer, Integer > visited = new HashMap < > ();

        for (i = 0; i < nums.length; i++) {

            int delta = target - nums[i];

            if (visited.containsKey(delta)) {

                return new int[] {
                    visited.get(delta), i
                };

            }


            visited.put(nums[i], i);

        }
        throw new IllegalArgumentException("target not found");

    }

}
