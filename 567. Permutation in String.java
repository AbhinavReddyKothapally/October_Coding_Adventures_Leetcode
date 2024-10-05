class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        if(n2<n1) return false;    
        int map1[]=new int[26];
        int map2[]=new int[26];
        for(int i=0;i<n1;i++)
        {
          map1[s1.charAt(i)-'a']++;
          map2[s2.charAt(i)-'a']++;  
        }
        if(check(map1,map2)) return true;
        for(int i=1;i<=n2-n1;i++)
        {
            map2[s2.charAt(i-1)-'a']--;
            map2[s2.charAt(i+n1-1)-'a']++;
            if(check(map1,map2)) return true;
        }
        return false;
    }
    public static boolean check(int arr1[],int arr2[])
    {
        for(int i=0;i<26;i++)
        if(arr1[i]!=arr2[i])return false;
        return true;
    }
}
