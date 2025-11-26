package enums;

public enum Day {
    sunday(1),
    monday(2),
    tursday(3),
    wenesday(4),
    thurday(5),
    friday(6),
    saturday(7);

    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }
}
