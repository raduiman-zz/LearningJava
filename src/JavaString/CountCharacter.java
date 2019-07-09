package JavaString;

public class CountCharacter {
    public static void main(String[] args) {
        String string = "The best of both worlds";
        int count = 0;
        for (int i = 0; i < string.length(); i++ ) {
            if (string.charAt(i) != ' ')
                count++;
        }
        System.out.println("The number of characters from string: '" + string + "' is: " + count);
    }
}