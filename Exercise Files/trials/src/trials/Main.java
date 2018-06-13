package trials;

public class Main {

    public static void main(String[] args) {

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";

        if (str4 == str5) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
        
        
        
        if (str4.equals(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
        
    }

}