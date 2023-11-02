public class ReverseString {
    public static void main(String[] args) {
        String s="Hello World";
        int a=s.length();

        while (a>0){
            System.out.print(s.charAt(a-1));
            a--;
        }

    }
}
