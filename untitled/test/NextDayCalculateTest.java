import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculateTest {

    @Test
    @DisplayName("1/1/2022")
        void Test112022() {
            int dayTest = 1;
            int monthTest = 1;
            int yearTest = 2022;
            String expected = "2/1/2022";
            String result = NextDayCalculate.getNextDay(dayTest,monthTest,yearTest);
            assertEquals(expected,result);
        }
    @Test
    @DisplayName("31/1/2022")
    void Test3112022() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2022;
        String expected = "1/2/2022";
        String result = NextDayCalculate.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("30/4/2022")
    void Test3042022() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2022;
        String expected = "1/5/2022";
        String result = NextDayCalculate.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("28/2/2022")
    void Test2822022() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2022;
        String expected = "1/3/2022";
        String result = NextDayCalculate.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("28/2/2020")
    void Test2822020() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2020;
        String expected = "29/2/2020";
        String result = NextDayCalculate.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }



}