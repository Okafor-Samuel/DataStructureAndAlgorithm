
public class Main {
    public static void main(String[] args) {
        System.out.println(XandOChecker.hasEqualXandO("xoxoxo"));
    }
import java.util.Locale;

public class XandOChecker {
    public static boolean hasEqualXandO(String str){
        String lowerCase = str.toLowerCase();
        int  xCount = countOccured(lowerCase, 'x');
        int oCount = countOccured(lowerCase, 'o');
        return xCount==oCount;
    }

    private static int countOccured(String lowerCase, char x) {
        int count =0;
        for (int i =0; i<lowerCase.length(); i++){
            if(lowerCase.charAt(i)==x) {
                count++;
            }
        }return count;
    }
}}
