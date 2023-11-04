package rough;
public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Ans is : " + solve(arr, 1));
    }

    public static int solve(int[][] arr, int B) {
        int n = arr.length;
        // top-right coordinate
        int i = 0;
        int j = arr[0].length - 1;
        int ans = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;

        while (i < n && j >= 0) {
            if (arr[i][j] == B) {
                temp = (i + 1) * 1009 + (j + 1);
                ans = Math.min(ans, temp);
                i++;
                j--;
            } else if (arr[i][j] > B) {
                j--;
            } else {
                i++;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
}
