class Solution {
    public int countWords(String s) {
        // code here
        String arr[]=s.trim().split("[ \t\n]+");
        int count=0;
        for(String st: arr){
            count++;
        }
        return count;
        
    }
}