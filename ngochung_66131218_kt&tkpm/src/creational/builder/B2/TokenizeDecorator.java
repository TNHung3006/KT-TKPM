package creational.builder.B2;

import java.util.List;

public abstract class TokenizeDecorator implements ITokenizer {
    protected ITokenizer tokenizer;

    public TokenizeDecorator(ITokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    @Override
    public List<String> tokenize() {
        return tokenizer.tokenize();
    }
}
