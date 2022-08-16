public class NextDayCalculate {

    public static final int FIRSTOFMONTHANDYEAR = 1;
    public static final String CONCAT = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        if  (dayTest == lastOfMonth(monthTest,yearTest) && !checkLastOfYear(dayTest,monthTest))
            return FIRSTOFMONTHANDYEAR + CONCAT + ++monthTest + CONCAT + yearTest;
        else if (checkLastOfYear(dayTest,monthTest))
            return FIRSTOFMONTHANDYEAR + CONCAT + FIRSTOFMONTHANDYEAR + CONCAT + ++yearTest;
        else return ++dayTest + CONCAT + monthTest + CONCAT + yearTest;

    }
    static int lastOfMonth(int monthTest, int yearTest){
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:{
                if (checkPrimeYear(yearTest))
                    return 29;
                else return 28;}
            default:
                return 30;
        }
    }
    static boolean checkPrimeYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    static boolean checkLastOfYear(int dayTest, int monthTest){
        return dayTest == 31 && monthTest == 12;
    }
}
