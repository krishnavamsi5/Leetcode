class Solution {
    public boolean isPalindrome(String s) {
        boolean m = true;
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
    int n = s.length();
    for(int i=0, j=n-1;i<n/2;i++,j--){
        if(s.charAt(i)!=s.charAt(j))
        m=false;
         }
         return m;
    }
   
}