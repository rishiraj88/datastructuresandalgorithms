import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayCheck {
//    without sorting the input array
    public boolean containsDup(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return  false;
    }

    // without creating any external data structure
    public boolean containsDups(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return  false;
    }
}
