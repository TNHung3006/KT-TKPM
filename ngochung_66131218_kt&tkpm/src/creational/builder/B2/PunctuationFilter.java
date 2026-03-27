package creational.builder.B2;

import java.util.List;

public class PunctuationFilter extends TokenizeDecorator{
    public PunctuationFilter(ITokenizer tokenizer) {
        super(tokenizer);
    }

    @Override
    public List<String> tokenize() {
        List<String> tokens = super.tokenize();
        for (int i = 0; i < tokens.size(); i++){
            String cleanedToken = tokens.get(i).replaceAll("[^a-zA-Z0-9À-ỹ]","");//[^\\p{L}\\p{M}\\p{N}]
            tokens.set(i, cleanedToken);
        }
        tokens.removeIf(String::isEmpty);
        return tokens;
    }
}
