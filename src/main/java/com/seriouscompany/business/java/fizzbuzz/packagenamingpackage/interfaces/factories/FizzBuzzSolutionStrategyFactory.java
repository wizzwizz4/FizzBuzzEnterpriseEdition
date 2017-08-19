package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

public interface FizzBuzzSolutionStrategyFactory extends Factory {

	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy();

}
