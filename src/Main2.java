import java.util.Scanner;

public class Main2 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            while (input.length() != (input = input.replaceAll("\\(\\)|\\[]|\\{}", "")).length()){
                System.out.println(input);
            }
            System.out.println(input.isEmpty());
        }

    }
}
