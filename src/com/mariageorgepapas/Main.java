package com.mariageorgepapas;

// Create a method called getDurationString with two parameters, first parameter minutes and second parameter seconds
// You should validate that the first parameter minutes is >=0
// You should validate that the second parameter seconds is >=0 and <=59
// The method should return "Invalid value" in the method if either of the above are not true
// If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed
// to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY
// the minutes and ZZ the seconds
//
// Create a second method of the same name but with only one parameter seconds
// Validate that it is >=0, and return "Invalid value" if it not true
// If it is valid, calculate how many minutes are in the seconds value and then call the other overloaded method passing
// the correct minutes and seconds calculated so that it can calculate correctly
// Call both methods to print values to the console
//
// Tips:  Use int or long for your number data types is probably a good idea
//        1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
//        Methods should be static
// Bonus: For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
//        Create a new console project and call it SecondsAndMinutesChallenge

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(78,9));
        System.out.println(getDurationString(932, 83));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(98242));
        System.out.println(getDurationString(-234));
        System.out.println(getDurationString(61,0));

    }


    private static String getDurationString(int minutes, int seconds) {

        if(minutes>=0 && (seconds>=0 && seconds<=59)) {
            int hours = minutes / 60;
            int minutesLeft = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = minutesLeft + "m";
            if(minutesLeft < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString;
        }
        return INVALID_VALUE_MESSAGE;
    }

    private static String getDurationString(int seconds) {

        if(seconds>=0) {
            int minutes = seconds / 60;
            int secondsLeft = seconds % 60;
            return getDurationString(minutes,secondsLeft);
        }
        return INVALID_VALUE_MESSAGE;
    }
}

