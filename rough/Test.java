package rough;
public class Test {

    public String reverse(String str) {
        //int i = 0;
        int j = str.length()-1;
        String str2="";
        while(j>0){
            str2+=str.charAt(j);
            j--;
        }
        return str2;
        
    }

    public int DecimalToAnyBase(int num, int base) {
        int rem = num % base;
        String str1 = "";
        str1 += rem;
        num = num / base;
        while (num > 0) {
            rem = num % base;
            str1 += rem;
            num = num / base;
        }
        int ans = Integer.valueOf(reverse(str1));
        return ans;
    }
}
