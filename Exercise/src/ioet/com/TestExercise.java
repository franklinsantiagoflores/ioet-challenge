package ioet.com;
import org.junit.Before;
import org.junit.Test;


public class TestExercise {
	private Exercise ex;
	
	@Before
	public void init() throws Exception {
		ex= new Exercise();
	}
	
	@Test
	public void payEmployed() {
		ex.uploadFile();
	}
	
}
