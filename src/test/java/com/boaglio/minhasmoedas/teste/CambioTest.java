package com.boaglio.minhasmoedas.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boaglio.minhasmoedas.service.CambioService;

public class CambioTest {

	@Test
	public void testaCotacaoDolar() {

		CambioService cs = new CambioService();
		assertEquals(3.30, cs.getCotacaoDolar(), .10);

	}

}
