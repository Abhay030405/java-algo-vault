// Print all binary strings of length n such that no two consecutive ones are present.

package Week1;

public class BinaryStringProblem {
    public static void printBinaryString(int size) {
        if(size <= 0) {
            System.out.println("Please send a size greater than zero");
            return;
        }
        util(size, 0);   // lastPlace lp = 0 initially
        System.out.println(); // for better readability
    }
    static StringBuilder str = new StringBuilder(""); 
    public static void util(int size, int lp) {
        if(size == 0) {
            System.out.print(str + "   ");
            str.deleteCharAt(str.length()-1);
            return;
        }
        if(lp == 0) {
            str.append("0");
            util(size-1, 0);
            str.append("1");
            util(size-1, 1);
        } else {
            str.append("0");
            util(size-1, 0);
        }
        if(str.length()>0) {
            str.deleteCharAt(str.length()-1);
        }
    }
    public static void main(String args[]) {
        printBinaryString(-3);
        printBinaryString(0);
        printBinaryString(1);
    }
}
