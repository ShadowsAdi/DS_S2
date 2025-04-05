
public class reverse_string {
    public static void reverse(char[] string)
    {
        if (string == null || string.length == 0)
        {
            return;
        }

        System.out.println(string);

        int iLeft = 0;
        int iRight = string.length - 1;

        while (iLeft < iRight)
        {
            char temp = string[iLeft];
            string[iLeft] = string[iRight];
            string[iRight] = temp;
            iLeft++;
            iRight--;
        }

        System.out.println(string);
    }

    public static void main(String[] args) {
        String str = "hello";
        reverse(str.toCharArray());
    }
}