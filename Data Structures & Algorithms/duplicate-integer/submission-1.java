class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int start = 0 ;
        int next = 0;

        for(start = 0 ; start <= nums.length-2 ; start++) {
            
            if(next <= nums.length-1){
            next=next+1;
            }

            if(nums[start] == nums[next]) {
                return true;
            }

        }

        return false;

    }
}