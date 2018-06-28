package com.boaglio.minhasmoedas.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boaglio.minhasmoedas.repository.CotacaoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CambioTest {

    @Autowired
    private CotacaoRepository cotacaoRepository;

	@Test
	public void testaCotacaoDolar() {

		long totalDeCotacoes =  cotacaoRepository.count();

		System.out.println(" totalDeCotacoes = "+totalDeCotacoes);

		assertTrue( totalDeCotacoes>200);

	}

}
