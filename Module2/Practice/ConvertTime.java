public class ConvertTime {
    public static void main(String[] args) {
        int inputTime = Integer.parseInt(args[0]);
        int hours = inputTime / 3600;
        int minutes = (inputTime % 3600) / 60;
        int seconds = minutes % 60;

        System.out.println(hours + "ч" + " " + minutes + "мин" + " " + seconds + "c");    
    }
}