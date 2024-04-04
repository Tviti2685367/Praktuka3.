package Pr2;

// Інтерфейс для фабрики результатів обчислень
public interface CalculationResultFactory {
    CalculationResult createCalculationResult(CalculationData calculationData);
}
