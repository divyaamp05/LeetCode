class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int n=s.length()-1;
        return reverse(s,0,n);
    }

    public boolean reverse(String s,int l,int r){
        if(l>=r){
            return true;
        }
         
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        } 
        return reverse(s,l+1,r-1); 

    }
}