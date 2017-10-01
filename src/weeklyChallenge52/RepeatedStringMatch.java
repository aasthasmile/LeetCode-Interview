package weeklyChallenge52;

/**
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

 For example, with A = "abcd" and B = "cdabcdab".

 Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 */
public class RepeatedStringMatch {

    public static void main(String[] args) {
        System.out.println(repeatString("abcd","cdabcdab"));
    }

    /**
     *  Repeating String a till String a length is equal to or greater then length of String b
     * @param a
     * @param b
     * @return
     */
    public static int repeatString(String a ,String b) {

        StringBuilder str=new StringBuilder();
        int count=0;
        while(str.length()<b.length()){
            str.append(a);
            count++;
        }

        if(str.toString().contains(b)) return count;
        else if (str.append(a).toString().contains(b)) return count+1;

        return -1;
    }
}
