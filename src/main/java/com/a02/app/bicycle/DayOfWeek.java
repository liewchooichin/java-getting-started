package com.a02.app.bicycle;

public enum DayOfWeek {

  MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

  private final String abbreviation;

  DayOfWeek(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void compareDayOfWeek(DayOfWeek dayOfWeek){
    int comparison = dayOfWeek.compareTo(DayOfWeek.WEDNESDAY);
    if (comparison < 0) {
        System.out.println("It's before the middle of the work week.");
    } else if (comparison > 0){
        System.out.println("It's after the middle of the work week.");
    } else {
        System.out.println("It's the middle of the work week.");
    }
}

}
