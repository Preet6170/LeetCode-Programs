class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    //     int ans = 0;
    //         for(int i=0;i<nums.length;i++){
    //             int count=0;
    //             for(int j=0;j<nums.length;j++){
    //                 if(nums[i]==nums[j]){
    //                     count++;
    //                 }
    //             }
    //             if(count>nums.length/2){
    //                 ans= nums[i];
    //             }
    //         }

    //         return ans;
    }
}
