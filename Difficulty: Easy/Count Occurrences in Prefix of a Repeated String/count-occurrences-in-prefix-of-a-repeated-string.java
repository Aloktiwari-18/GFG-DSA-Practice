

class Solution{
    public  int countOccurrences(String s,  int n, char c)
    {
        // Your code here
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        count=count*(n/s.length());
        for(int i=0;i<n%s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}