class Solution {
    public int strStr(String haystack, String needle) {
        String s="";
        int l=0;
        for(int i=0;i<haystack.length();i++)
        {
            s="";
            if(haystack.charAt(i)==needle.charAt(0))
            {
            for(int j=i;j<haystack.length();j++)
             {
               s+=haystack.charAt(j);
                    if(s.equals(needle))
                    return i;
            }
            }
    }
    return -1;
}
}