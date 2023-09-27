package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String result;
        switch (monthNumber) {
            case 1, 2, 12:
                result = "Winter";
                break;
            case 3,4,5:
                result = "Spring";
                break;
            case 6,7,8:
                result = "Summer";
                break;
            case 9,10,11:
                result = "Autumn";
                break;
            default:
                result = "Wrong month number";
        }
        System.out.println(result);
    }
}
