package com.boaglio.minhasmoedas.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boaglio.minhasmoedas.domain.Cotacao;

public interface CotacaoRepository extends CrudRepository<Cotacao, Long> {

    @Query("SELECT AVG(c.value) from Cotacao c")
    double getAverageValue();

    @Query("SELECT MAX(c.value) from Cotacao c")
    double getMaxValue();

    @Query("SELECT MIN(c.value) from Cotacao c")
    double getMinValue();

    @Query("SELECT MAX(c.day) from Cotacao c")
    Date getMaxDay();

    @Query("SELECT MIN(c.day) from Cotacao c")
    Date getMinDay();

    @Query(value="SELECT DATABASE()",nativeQuery = true)
    String getMySQLDatabase();

}