class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String w="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                w+=ch;
            else
                break;
        }
        return w.length();
    }
}