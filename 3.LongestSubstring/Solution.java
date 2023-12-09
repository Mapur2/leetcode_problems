class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j=0,k;
        String w="",l="";
        for(i=0;i<s.length();i++)
        {
            //char ch=s.charAt(i);
            for(j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(w.indexOf(c)>=0)
                {
                    break;
                }
                w+=c;
            }
            if(l.length()<w.length())
            {l=w;}
            w="";
            //System.out.println(w);
        }
        if (s.equals(""))
        l="";
        else if(l.length()==0)
        l+=s.charAt(0);
        System.out.println(l);
        return l.length();
    }
}