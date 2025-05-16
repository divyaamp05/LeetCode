class Solution {
    public int maxProduct(int n) {
        int x=n;
        int rem=0;
        ArrayList <Integer> ls=new ArrayList <> ();

        while(x!=0){
           rem=x%10;
           ls.add(rem);
           x=x/10;
        }

        Collections.sort(ls);
        
        return ls.get(ls.size()-1) * ls.get(ls.size()-2);
    }
}