package midterm2;

public class E10Enum {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        for (Day d : Day.values()) {
            // if (d == today)
            System.out.println(d);
        }
    }
}
