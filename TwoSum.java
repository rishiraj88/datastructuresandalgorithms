public class TwoSum {
    public int[] twoSum(int[] nums,int target) {
        int a = 0;
        int b = nums.length -1;

        while(a <= b) {
            int sum = nums[a] + nums[b];

            if(sum > target){
                b -= 1;
            }else if (sum < target) {
                a +=1;
            } else {
                return new int[]{a+1, b+1};
            }
        }
        return new int[] {a+1,b+1};
    }

    // [2,7,11,15], 9
}
