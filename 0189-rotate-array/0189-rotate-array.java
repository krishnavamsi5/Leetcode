class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] array = new int[n];
        while(k>n)
        k = k-n;
        if(n>1){
        for(int i =0; i < n; i++){
            if(i+k < n)
            array[i+k]= nums[i];
            if(i+k >= n)
            array[(i+k)-n]= nums[i];
            
        }
        System.arraycopy(array,0,nums,0,array.length);}
        
    }
}