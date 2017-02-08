package module3.training;


public class EnumUtils {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    Day day;

    public EnumUtils(Day day) {
        this.day = day;
    }

    public void tellItLikeThis() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumUtils firstDay = new EnumUtils(Day.MONDAY);
        firstDay.tellItLikeThis();
        EnumUtils secondDay = new EnumUtils(Day.FRIDAY);
        secondDay.tellItLikeThis();
        EnumUtils thirdDay = new EnumUtils(Day.THURSDAY);
        thirdDay.tellItLikeThis();
        EnumUtils fourthDay = new EnumUtils(Day.SUNDAY);
        fourthDay.tellItLikeThis();

    }
}
