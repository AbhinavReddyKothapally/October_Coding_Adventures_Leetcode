class Solution {
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        int maxIndex = n - 1;
        int x = -1, y = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (numArr[i] > numArr[maxIndex]) {
                maxIndex = i;
            } else if (numArr[i] < numArr[maxIndex]) {
                x = i;
                y = maxIndex;
            }
        }

        if (x != -1) {
            char temp = numArr[x];
            numArr[x] = numArr[y];
            numArr[y] = temp;
        }

        return Integer.parseInt(new String(numArr));
    }
}
