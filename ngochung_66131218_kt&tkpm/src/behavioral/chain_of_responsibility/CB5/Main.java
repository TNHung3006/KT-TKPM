package behavioral.chain_of_responsibility.CB5;

public class Main {
    public static void main(String[] args) {
        GradeEvaluator weak = new StandardGradeEvaluator("Yeu", 0, 5, false);
        GradeEvaluator average = new StandardGradeEvaluator("Trung binh", 5, 7, false);
        GradeEvaluator good = new StandardGradeEvaluator("Kha", 7, 8, false);
        GradeEvaluator verygood = new StandardGradeEvaluator("Gioi", 8, 9, false);
        GradeEvaluator excellent = new StandardGradeEvaluator("Kuat sac", 9, 10, true);

        weak.setNextEvaluator(average).setNextEvaluator(good)
                .setNextEvaluator(verygood).setNextEvaluator(excellent);
        System.out.println("--HE THONG XEP LOAI HOC SINH--");
        double[] testScores = {3.3, 5.0, 6.6, 7.7, 8.0, 9.5, 10.0, -1.5, 11.0};
        for (double score : testScores){
            weak.evaluate(score);
        }
    }
}
