class Solution {
    public int minDeletion(String s, int k) {

        HashMap<Character,Integer> mp=new HashMap <> ();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        int a=mp.size();
        if(a<=k){
            return 0;
        }

        ArrayList <Integer> ls=new ArrayList <> (mp.values());
        Collections.sort(ls);
        int b=ls.size();
        int extra=b-k;
        int deletions=0;
        for(int i=0;i<extra;i++){
            deletions+=ls.get(i);
        }
        
        return deletions;
    }
}