public class FunctionZ {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double z = ((a - 3) * b/2) + c;
        System.out.println("Z function is: " + z);
    }
}