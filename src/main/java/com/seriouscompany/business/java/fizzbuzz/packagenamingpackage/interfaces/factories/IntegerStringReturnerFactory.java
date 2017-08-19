package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public interface IntegerStringReturnerFactory extends Factory {

	public IntegerStringReturner createIntegerStringReturner();

}
