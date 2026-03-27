package creational.builder.B2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Tokenize là quá trình tách một chuỗi thành các từ.";

        ITokenizer tokens = new BasicTokenizer(text);
        System.out.println("Chuoi goc: " + text);
        System.out.println("1. Tach tu: " + tokens.tokenize());

        tokens = new StopWordFilter(tokens);
        System.out.println("2. stop word: " + tokens.tokenize());

        tokens = new PunctuationFilter(tokens);
        System.out.println("3. Loai bo dau cau: " + tokens.tokenize());



        ITokenizer full = new PunctuationFilter(new StopWordFilter(new BasicTokenizer(text)));
        System.out.println("4. Full: " + full.tokenize());
    }
}
