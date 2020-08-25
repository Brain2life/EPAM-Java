public class CheckCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        boolean isInArea;

        isInArea = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 4));
        System.out.println(isInArea);
    }
}