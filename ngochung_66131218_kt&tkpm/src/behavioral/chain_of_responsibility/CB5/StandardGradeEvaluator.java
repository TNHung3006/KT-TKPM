package behavioral.chain_of_responsibility.CB5;

public class StandardGradeEvaluator extends GradeEvaluator{
    private String gradeName;
    private double minScore;
    private double maxScore;
    private boolean isMaxInclusive;

    public StandardGradeEvaluator(String gradeName, double minScore, double maxScore, boolean isMaxInclusive) {
        this.gradeName = gradeName;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.isMaxInclusive = isMaxInclusive;
    }

    @Override
    public void evaluate(double score) {
        boolean isMatch = isMaxInclusive ? (score >= minScore && score <= maxScore) : (score >= minScore && score < maxScore);
        if(isMatch){
            System.out.println("Diem: " +score+ " --> Xep Loai: " +gradeName);
        } else if (nextEvaluator != null) {
            nextEvaluator.evaluate(score);
        }else {
            System.out.println("Diem: " +score+ "--> [Loi]: Diem khong hop le");
        }
    }
}
