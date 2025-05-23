class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=i;p=1;
                return result;
            }
        }
          if(nums[0]>target){return 0;}
          if(nums[nums.length-1]<target){return nums.length;}
          for(int i=0;i<nums.length;i++){
            if(nums[i]<=target){
                result=i;
            }
            
          } 
          return result+1;
    }
}
