package behavioral.chain_of_responsibility.CB5;

public abstract class GradeEvaluator {
    protected GradeEvaluator nextEvaluator;

    public GradeEvaluator setNextEvaluator(GradeEvaluator nextEvaluator) {
        this.nextEvaluator = nextEvaluator;
        return this.nextEvaluator;
    }
    public abstract void evaluate(double score);
}
