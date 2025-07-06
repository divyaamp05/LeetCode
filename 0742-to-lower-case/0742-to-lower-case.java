class Solution {
    public String toLowerCase(String s) {
        char str[]=s.toCharArray();
        int n=str.length;
        for(int i=0;i<n;i++){
            char ch=str[i];
            if(ch>='A' && ch<='Z'){
                str[i]=(char)(ch-'A'+'a');
            }
        }

        return new String(str);
    }
}