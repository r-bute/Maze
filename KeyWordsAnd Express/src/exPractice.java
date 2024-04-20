public class exPractice {
    public static void main(String[] args) {
      System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }
    public static  double toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour > 0) {
          double milesPerHour = kilometersPerHour / 1.5d;
            return milesPerHour;
        } else{
            return -1;

        }
    }
}
