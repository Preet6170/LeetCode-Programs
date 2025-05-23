class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int m = nums1.length, n=nums2.length;
        int[] arr = new int[m+n];
        double result = 0;
        
        for(int i = 0; i < m; i++){
            arr[i] = nums1[i];
        }
        for(int i =0; i <n; i++){
            arr[m+i] = nums2[i];
        }
        Arrays.sort(arr);
        if((m+n)%2 == 0){
            result = (arr[(m+n)/2] + arr[((m+n)/2 -1)])/2.0; 
        }
        else{
            result = arr[(m+n)/2];
        }
        return result;
    }
}
        
        
          
    
