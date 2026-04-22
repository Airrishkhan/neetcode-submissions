class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];

        for(int i=0 ; i<numbers.length ; i++){

            if(!hm.containsKey(target-numbers[i])){
                hm.put(numbers[i],i+1);
            }else{
                res[0]=hm.get(target-numbers[i]);
                res[1]=i+1;
                return res;
            }

        }

        return res;

    }
}
