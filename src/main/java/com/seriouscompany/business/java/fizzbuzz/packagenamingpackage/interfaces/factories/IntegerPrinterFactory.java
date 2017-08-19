package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

public interface IntegerPrinterFactory extends Factory {

	public IntegerPrinter createPrinter();

}
