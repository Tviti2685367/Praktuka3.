package Pr2;

import java.io.Serializable;

// Класс для решения задачи
public class ProblemSolver implements Serializable {
    private static final long serialVersionUID = 1L;

    private CalculationData calculationData;

    public ProblemSolver(double parameter1, double parameter2) {
        this.calculationData = new CalculationData(parameter1, parameter2, 0.0);
    }

    // Метод для решения задачи
    public void solveProblem() {
        // Ваш код для решения задачи, например, складываем параметры
        double result = calculationData.getParameter1() + calculationData.getParameter2();
        calculationData.setResult(result);
    }

    // Метод для получения результата
    public double getResult() {
        return calculationData.getResult();
    }
}