class Solution {
    public void sortColors(int[] nums) {
        int st=0;int mid=0;int end=nums.length-1;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums,st,mid);
                    mid++;
                    st++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;
            }
        }
    }
    private void swap(int [] arr, int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}