package Pr2;

// Фабрика для створення об'єктів AdditionResult
public class AdditionResultFactory implements CalculationResultFactory {
    @Override
    public CalculationResult createCalculationResult(CalculationData calculationData) {
        return new AdditionResult(calculationData);
    }
}
