class Solution {
    public boolean areAlmostEqual(String s1, String s2) 
    {
        if(s1.equals(s2)){
            return true;
        }
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                String swapped=swap(s1,i,j);
                if(swapped.equals(s2)){
                    return true;
                }
            }
        }

        return false;
    }

    public String swap(String s,int i,int j){

        char [] arr=s.toCharArray();

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return new String(arr);
    }
}