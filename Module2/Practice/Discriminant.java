public class Discriminant {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        double output = (b + Math.sqrt(b*b + 4*a*c))/(2*a) + (1/(b*b) - Math.pow(a, 3)*c);
        System.out.println("Function output is: " + output);
    }
}