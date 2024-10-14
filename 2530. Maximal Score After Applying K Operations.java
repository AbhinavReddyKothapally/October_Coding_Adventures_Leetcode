class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        pQueue.add(nums[i]);
        long ans=0;
        while(k-->0)
        {
            int val=pQueue.poll();
            ans+=val;
            pQueue.add((int)(Math.ceil(val/3.0)));
        }
        return ans;
    }
}
