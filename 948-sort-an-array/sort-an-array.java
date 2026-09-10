class Solution {
    public int[] sortArray(int[] nums){
        quick(nums,0,nums.length-1);
        return nums;
    }
    
    void quick(int[] nums,int low,int high){
        if(low>=high)return;
        int i=low,j=high;
        int pivot=nums[low+(high-low)/2];
        while(i<=j){
            while(nums[i]<pivot)i++;
            while(nums[j]>pivot)j--;
            if(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        quick(nums,low,j);
        quick(nums,i,high);
    }
}