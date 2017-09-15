package be.pxl.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

	@Test
	public void eigenaarOnbekendIndienEigenaarNietInConstructor() {
		Auto auto = new Auto("BMW", 25000.50);
		assertEquals("Onbekend", auto.getEigenaar());
	}
	
	@Test
	public void verhoogPrijsVerhoogtDeInitielePrijsVanDeAutoMetGegevenPercentage() {
		Auto auto = new Auto("BMW", 25000.50);
		auto.verhoogPrijs(10);
		Assert.assertEquals(27500.55, auto.getPrijs(), 0.001);
	}
}
