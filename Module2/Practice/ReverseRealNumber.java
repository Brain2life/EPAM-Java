public class ReverseRealNumber {
    public static void main(String[] args) {
        double inputNumber = Double.parseDouble(args[0]);
        int wholePart = (int) inputNumber;
        double floatPart = (int) (inputNumber * 1000) - (wholePart * 1000);

        double outputNumber = floatPart + wholePart/1000.0;
        
        System.out.println(outputNumber);
    }
}