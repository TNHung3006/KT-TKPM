package creational.builder.B2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StopWordFilter extends TokenizeDecorator{
    private List<String> stopwords = Arrays.asList( "và", "hoặc", "thì", "mà", "là");

    public StopWordFilter(ITokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        tokens.removeIf(token-> stopwords.contains(token.toLowerCase()));
        return tokens;
    }
}
