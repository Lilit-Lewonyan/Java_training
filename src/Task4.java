
public class Task4 {
    public static void main(String[] args) {
        System.out.println(getdaysoflife(8));
        System.out.println(isallowedforclub(8));
        printdaysofweek(3);
        System.out.println(touppercase("barev karmir arev"));
        System.out.println(dayofMonth(8));


    }

    /*N1: Write a function which will get parameter age
     (int) and will return converted to days of live (int).
     */
    public static int getdaysoflife(int age) {
        /*  A leap year is a calendar year that contains an additional day(366).
         These extra days occur in each year which is an integer multiple of 4,
         I  calculate that during the given life cycle how many leap years have.
         */
        int yearscount366 = (age - (age % 4)) / 4;
        int days = yearscount366 * 366 + (age - yearscount366) * 365;
        return days;
    }

    /* N2 : Write a function which will get age and return
     is the person allowed to enter the club
     (allows for people older the 18)
      */
    public static boolean isallowedforclub(int age) {
        return age >= 18 ? true : false;

    }

    /*Write a function which prints all days until Saturday.
    “Sunday”, “Monday”, ... “Saturday”.
    For example if we pass 3, it is Thursday, the program should print all days till Saturday .
     */
    public static void printdaysofweek(int dayofweek) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = dayofweek; i < 7; i++) {
            System.out.println(week[i]);
        }

    }

    /*Write a function which will get string as parameter and l return the same string with uppercase .
    don’t use string.toUppercase function.
     */
    public static String touppercase(String givenstring) {
        String uppercaseString = "";
        //int[] intvaluseofuppercasechars = {
        for (int i = 0; i < givenstring.length(); i++) {
            if ((int) givenstring.toCharArray()[i] >= 97 && (int) givenstring.toCharArray()[i] <= 122) {
                uppercaseString = uppercaseString + (char) ((int) givenstring.toCharArray()[i] - 32);
            } else
                uppercaseString = uppercaseString + givenstring.toCharArray()[i];
        }

        return uppercaseString;
    }


    /*Write a function that takes dayOfMonth(int) as a parameter and returns day
    + suffix (for example   1-> 1st, 2 ->2nd………, 13-> 13th, 23-> 23rd,
    …. 31->31rd), and if the input number is not from 1 to 31, print “Not Valid Day of Month”.
     */

    public static String dayofMonth(int dayOfMonth){

        if(dayOfMonth<=31){
        switch (dayOfMonth) {
            case 1:
                return dayOfMonth + "st";
            case 21:
                return dayOfMonth + "st";
            case 2:
                return dayOfMonth + "nd";
            case 22:
                return dayOfMonth + "nd";
            case 3:
                return dayOfMonth + "rd";
            case 23:
                return dayOfMonth + "rd";
            default:
                return dayOfMonth + "th";
        }
        }
        else return "Not Valid Day of Month";

}



}
