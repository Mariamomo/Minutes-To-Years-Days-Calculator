public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        System.out.println(printYearsAndDays(561600L));
        System.out.println(printYearsAndDays(1051200L));
        System.out.println(printYearsAndDays(525600L));
    }

    public static String printYearsAndDays(long minutes){
        if(minutes < 0){
            return "Invalid Value";
        }
        long hours = minutes / 60;
        return printYearsAndDays(hours,minutes);
    }
    public static String printYearsAndDays(long hours, long minutes){
        long days = hours / 24;
        long remainghours =  hours % 24;
        return printYearsAndDays(days,remainghours,minutes);
    }
    public static String printYearsAndDays(long days, long hours,long minutes){
        long years = days / 365;
        long remaingdays =  days % 365;
        return minutes + " min = " + years + " y and " + remaingdays + " d";
    }

}
