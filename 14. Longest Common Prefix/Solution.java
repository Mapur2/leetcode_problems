class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs[0].length(),j;
        String w="";
        for(int i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(j=1;j<strs.length;j++)
            {
                if(strs[j].length()<=i)
                break;
                char ch=strs[j].charAt(i);
                if(ch!=c)
                break;
            }
            if(j==strs.length)
            w=w+c;
            else
            break;
        }
        return w;
    }
}