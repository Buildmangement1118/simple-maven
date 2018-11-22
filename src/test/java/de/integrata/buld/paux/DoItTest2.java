package de.integrata.buld.paux;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class DoItTest2 {

	@Test
	public void testAdd() {
		assertThat(DoIt.add(1, 2), CoreMatchers.is(3));
	}
	
	
}
