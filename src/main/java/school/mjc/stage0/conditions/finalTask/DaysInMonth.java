package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leapOrNot;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapOrNot = true;
        } else {
            leapOrNot = false;
        }
        String result;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                result = "31";
                break;
            case 4, 6, 9, 11:
                result = "30";
                break;
            case 2:
                if (leapOrNot) {
                    result = "29";
                } else {
                    result = "28";
                }
                break;
            default:
                result = "invalid date";
        }
        System.out.println(result);
    }
}
