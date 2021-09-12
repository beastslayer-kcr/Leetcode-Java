class Solution {
    public int[] twoSum(int[] nums, int target) {
        // put in to map
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
             hp.put(nums[i],i);
        }
        for(int i=0 ;i<nums.length;i++){
            
            int diff = target - nums[i];
            if(hp.containsKey(diff)){
                int index = hp.get(diff);
                if(index == i) continue;
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}
