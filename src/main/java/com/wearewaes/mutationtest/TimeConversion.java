package com.wearewaes.mutationtest;

public class TimeConversion {
    public String convert(String s) {  //11:30:00 PM -> 23:30:00
        int givenHour = Integer.parseInt(s.substring(0, 2));
        var suffix = s.substring(8);
        int convertedHour;
        if (suffix.equalsIgnoreCase("PM") && givenHour < 12) {
            convertedHour = givenHour + 12;

        } else if (suffix.equals("AM") && givenHour >= 12) {
            convertedHour = givenHour - 12;
        } else {
            convertedHour = givenHour;
        }

        return String.format("%02d", convertedHour) + s.substring(2, 8);
    }
}
