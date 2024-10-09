class Solution {
    public int minAddToMakeValid(String s) {
        int count=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') count++;
            else count--;
            if(count<0) {
                ans+=Math.abs(count);
                count=0;
            }
        }
        return ans+count;
    }
}
