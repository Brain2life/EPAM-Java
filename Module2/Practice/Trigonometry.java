public class Trigonometry {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        double output = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x * y);
        System.out.println("Function output: " + output);
    }
}