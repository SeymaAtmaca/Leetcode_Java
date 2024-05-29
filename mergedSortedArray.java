import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArr = new int[m+n];
        System.arraycopy(nums1, 0, mergedArr, 0, m);
        System.arraycopy(nums2, 0, mergedArr, m, n);
        Arrays.sort(mergedArr);
        System.arraycopy(mergedArr,0, nums1,0, m+n);
    }
}


// daha hızlı bir çözüm ;
class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m;
        int p2 = n;
        int pmerged = p1+p2;

        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[pmerged--] = nums1[p1--];
            }else{
                nums1[pmerged--] = nums2[p2--];
            }
        }
    }
}