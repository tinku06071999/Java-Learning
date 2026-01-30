public class Main {
    public static void main(String[] args) {
        for (WeekDay day : WeekDay.values()) {
            switch (day) {
                case SUNDAY:
                    day.display();
                    break;
                case MONDAY:
                    day.display();
                    break;
                case TEUSDAY:
                    day.display();
                    break;
                case WEDNESDAY:
                    day.display();
                    break;
                case THURSDAY:
                    day.display();
                    break;
                case FRIDAY:
                    day.display();
                    break;
                case SATUARDAY:
                    day.display();
                    break;
                default:
                    System.out.println("Default");
            }

        }
    }

}
