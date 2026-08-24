class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 && nums2.length == 1 ) return nums2[0];
        else if( nums1.length == 1 && nums2.length == 0) return nums1[0];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        int median = (nums1.length + nums2.length) / 2;
        int[] storage = new int[nums1.length + nums2.length];
 
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] <= nums2[p2]){
                storage[p3] = nums1[p1];
                p1++;
            }else{
                storage[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }

        while(p1 < nums1.length){
            storage[p3] = nums1[p1];
            p1++;
            p3++;
        }

        while(p2 < nums2.length){
            storage[p3] = nums2[p2];
            p2++;
            p3++;
        }

        for(int i : storage)System.out.print(i+" ");

        return (storage.length % 2 == 0) ? 
                (double)(storage[median] + storage[median - 1]) / 2 :
                (double) storage[median];
         
    }
}