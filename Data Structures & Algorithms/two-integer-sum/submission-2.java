class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indices = new int[2];

         //using hashmap or 2d array

         HashMap<Integer,Integer> ht = new HashMap<>();

         for(int i=0 ; i<nums.length ; i++) {

            if(ht.containsKey(target-nums[i])) {
                indices[0] = ht.get(target-nums[i]);
                indices[1] = i;
                break;
            }else {
                ht.put(nums[i],i);
            }

         }
    return indices;
    }
}