
/**
 * example code for JUnit !!!- pelindrome
 **/

public class hello {
    public  boolean solution(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0))
            return false;

        int rh = 0;

        while (num > rh) {
            rh = rh * 10 + num % 10;
            num /= 10;
        }

        return num == rh || num == rh / 10;
    }

}
