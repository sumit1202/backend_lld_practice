package rough;

public class Test4{
    public int solve(String strA, String strB) {

        long hashB = 0;
        long hashA = 0;
        long p = 1;
        int m = strB.length();
        int n = strA.length();
        int count = 0;
        if (strB.length() > strA.length())
            return count;
        // calculate hash function for B
        for (int i = m - 1; i >= 0; i--) {

            hashB += (strB.charAt(i) - 'a') * p;
            hashA += (strA.charAt(i) - 'a') * p;

            p = p * 26;

        }
        p = p / 26;

        if (hashA == hashB)
            count++;

        // rolling hash function
        int j = 0;

        for (int i = m; i < n; i++) {
            hashA = (hashA - ((strA.charAt(j) - 'a') * p)) * 29 + (strA.charAt(i) - 'a');

            if (hashA == hashB)
            count++;

            j++;

        }

        return count;

    }
}
