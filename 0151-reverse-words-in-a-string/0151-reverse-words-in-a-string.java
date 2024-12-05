class Solution 
{
    public String reverseWords(String s) 
    {
        s=s.trim();

        String [] words=s.split("\\s+");

        reverse(words,0,words.length-1);

        return String.join(" ", words);

        
    }

    public void reverse(String [] words,int start,int end)
    {
        while(start<=end)
        {
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
       
    }

}