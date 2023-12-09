class Solution {
    public String reverseVowels(String s) {
int l=s.length(),t=l-1,i,j,m=0;
            System.out.println(l);
            char a[]=new char[l];
            for(i=0;i<l;i++)
            a[i]=s.charAt(i);
            char ch,c;
            for(i=0;i<l;i++)
            {
                ch=a[i];
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' 
                ||ch=='A' || ch=='E' || ch=='I' || ch=='O' 
                || ch=='U'  )
                {
                for(j=t;j>=0 && i<t;j--)
                {
                    t--;
                    c=a[j];
                    if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'
                    ||c=='A' || c=='E' || c=='I' || c=='O' 
                || c=='U' )
                    {char p=a[j];m=j;
                        a[j]=a[i];
                        a[i]=p;break;
                        
                    }
                }
                System.out.println(i+" "+ch+" Swaps "+m+" "+a[m]);
                }
            }
            s="";
            for(i=0;i<l;i++)
            s+=a[i];
            return s; 
    }
}