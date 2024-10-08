// Will get TLE if input length is high
// class Solution {
//     public int minSwaps(String s) {
//         StringBuilder sb=new StringBuilder(s);
//         int ans=0,open=0,close=0,k=sb.length()-1;;
//         for(int i=0;i<sb.length();i++)
//         {
//             if(sb.charAt(i)=='[') open++;
//             else close++;
//             if(close>open)
//             {
//                 while(sb.charAt(k)==']')
//                 {
//                     k--;
//                 }
//                 sb.replace(i,i+1,"[");
//                 sb.replace(k,k+1,"]");
//                 close--;
//                 open++;
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }
