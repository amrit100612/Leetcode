class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==0){
            return -1;
        }
        int[] PrefMax = new int[n];
        PrefMax[0] = nums[0];
        for(int i=1;i<n;i++){
            PrefMax[i]=Math.max(PrefMax[i-1],nums[i]);
        }
        int[] sufMin = new int[n];
        sufMin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            sufMin[i]=Math.min(sufMin[i+1],nums[i]);
        }
        for (int i=0;i<n;i++){
            int instability = PrefMax[i]-sufMin[i];
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}
