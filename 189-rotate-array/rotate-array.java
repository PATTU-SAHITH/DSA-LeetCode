class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0 || k % n == 0) return;
        k = k % n;
        swap(0, n - 1, nums);
        swap(0, k - 1, nums);
        swap(k, n - 1, nums);
    }

    public void swap(int s, int e, int[] a){
        while(s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}