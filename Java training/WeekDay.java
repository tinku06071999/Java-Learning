public enum WeekDay {
    SUNDAY, MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATUARDAY;

    private WeekDay(){
        System.out.println("Enum constructor called for: "+ this);
    }
    public void display(){
        System.out.println("Day is: " + this);
    }
}
