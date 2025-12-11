class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]  arr = new int[m+n];
        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                arr[k]=nums1[i];
                k++;i++;
                arr[k]=nums2[j];
                k++;j++;
            }else if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;i++;
            }else{
                arr[k]=nums2[j];
                k++;j++;
            }
        }
        while(i<m){
            arr[k]=nums1[i];
            k++;i++;
        }
        while(j<n){
            arr[k]=nums2[j];
            k++;j++;
        }

        for(int x=0;x<nums1.length;x++){
            nums1[x]=arr[x];
        }
    }
}