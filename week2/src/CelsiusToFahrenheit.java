public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        for (i = args[0]; i <= args[1]; i += args[2]){
            System.out.println(i, (i * 9 / 5) + 32);
        }
    }
}
