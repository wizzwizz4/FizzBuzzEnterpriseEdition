package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

public interface FactoryFactory extends Factory {

	public FactoryFactory createFactoryFactory();

	public FizzBuzzOutputStrategyFactory createOutputStrategyFactory();

	public FizzBuzzSolutionStrategyFactory createFizzBuzzSolutionStrategyFactory();

	public IntegerPrinterFactory createPrinterFactory();

	public IntegerStringReturnerFactory createIntegerStringReturnerFactory();

	public IsEvenlyDivisibleStrategyFactory createIsEvenlyDivisibleStrategyFactory();

	public OutputGenerationContextVisitorFactory createVisitorFactory();

	public StringPrinterFactory createStringPrinterFactory();

	public StringStringReturnerFactory createStringStringReturnerFactory();

}
