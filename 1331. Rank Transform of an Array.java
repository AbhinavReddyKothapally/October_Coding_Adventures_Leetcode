class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] a=arr.clone();
        Arrays.sort(arr);
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                k++;
                map.put(arr[i],k);
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i]=map.get(a[i]);
        }
        return a;
    }
}
