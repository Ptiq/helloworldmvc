package org.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {

	private DAOHelloWorld daohelloworld;


	@Before
	public void setUp() throws Exception {
		this.daohelloworld = new DAOHelloWorld();
	}

	@Test
	public void testOpen() {
		final boolean mabite = true;
		assertEquals(mabite ,this.daohelloworld.open());
	}

}
