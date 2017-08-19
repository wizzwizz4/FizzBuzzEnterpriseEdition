package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public interface StringPrinterFactory extends Factory {

	public StringPrinter createStringPrinter();

}
