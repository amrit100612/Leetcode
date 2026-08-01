class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        int x = 0;
        for(int i=0; i<hl; i++){
            if(haystack.charAt(i)==needle.charAt(x)){
                x++;
            }
            else{
                i=i-x;
                x=0;
            }
            if(x==nl){
                return i-nl+1;
            }
        }
        return -1;
    }
}