class Solution {
    public int maxProduct(int n) {
        int max = 0,temp = 0;
        while (n > 0) {
            int num = n % 10;
            if (num > max) {
                temp = max;
                max = num;
            } else if (num > temp) {
                temp = num;
            }
            n = n / 10;
        }
        return max * temp;
    }
}