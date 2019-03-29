package ioet.com;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestExercise {
	private Exercise ex;
	
	@Before
	public void init() throws Exception {
		ex= new Exercise();
	}
	
	@Test
	public void payRene() {
		double[][]fillMatrizWeek=ex.fillMatrix();
		boolean [][] dayJobRene=ex.fillJob("RENE");
		
		Assert.assertEquals(215, ex.amountPay(dayJobRene,fillMatrizWeek).intValue());
	}
	@Test
	public void payAstrid() {
		double[][]fillMatrizWeek=ex.fillMatrix();
		boolean [][] dayJobAstrid=ex.fillJob("ASTRID");
		Assert.assertEquals(85, ex.amountPay(dayJobAstrid,fillMatrizWeek).intValue());
	}
}
