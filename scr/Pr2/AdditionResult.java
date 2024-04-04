package Pr2;

// Клас для відображення результату додавання
public class AdditionResult implements CalculationResult {
    private CalculationData calculationData;

    public AdditionResult(CalculationData calculationData) {
        this.calculationData = calculationData;
    }

    @Override
    public void displayResult() {
        System.out.println("Result of addition: " + calculationData.getResult());
    }
}
