class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = nums[i];
            int b = target-a;
            if(map.containsKey(b)){
                return new int[]{map.get(b),i};
            }
            map.put(a,i);
        }
        return new int[]{};
    }
}


