class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}


/**
class Solution {
public:
    string toLowerCase(string s) {
        
        for(int i=0;i<s.size();i++)
        {
            char c=s[i];
            
            if(c>=65&&c<=90)
            {
                s[i]=(c-'A')+'a';
            }
        }
        
        return s;
    }
};
**/