class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        int n=skill.length;
        Arrays.sort(skill);
        int sum=skill[0]+skill[n-1];
        int i=0,j=n-1;
        while(i<j)
        {
            if(skill[i]+skill[j]!=sum) return -1;
            else ans+=(skill[i]*skill[j]);
            i++;
            j--;
        }
        return ans;
    }
}
