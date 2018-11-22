package de.integrata.buld.paux;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class DoItTest2 {

	@Test
	public void testAdd() {
		Arrays.asList(1,2).stream().anyMatch(x -> x > 0);

		assertThat(DoIt.add(1, 2), CoreMatchers.is(3));
	}
	
	
}
