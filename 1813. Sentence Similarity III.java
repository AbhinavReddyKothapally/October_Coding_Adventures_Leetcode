class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
          int len1=sentence1.length();
           int len2=sentence2.length();
           String[] small;
           String[] big;
           if(len1>len2)
           {
               small=sentence2.split(" ");
               big =sentence1.split(" ");
           }
           else {
                small=sentence1.split(" ");
                big =sentence2.split(" ");
           }
           int i;
           for(i=0;i<small.length;i++)
           {
               if(!small[i].equals(big[i]))
                   break;
           }
           if(i==small.length)
               return true;
           int j;
           int k=big.length-1;
           for(j=small.length-1;j>=i;j--)
           {
               if(!small[j].equals(big[k--]))
                   break;
           }
        return j == i - 1;
    }
}
