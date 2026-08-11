class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int n= arr.length;
        Arrays.sort(arr);
        String fst= arr[0];
        String lst= arr[n-1];
        StringBuilder st= new StringBuilder();
        for(int i=0;i<fst.length();i++){
            if(fst.charAt(i)==lst.charAt(i)){
                st.append(fst.charAt(i));
            }else{
                break;
            }
        }
        return st.toString();
    }
}