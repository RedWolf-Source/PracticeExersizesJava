public class Exersize8 {
    import java.util.Scanner;
    public class Exercize8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextString(in);
            String result = str.replaceAll("\\s", "");
            System.out.printf(result);
        }

    }
}

}
