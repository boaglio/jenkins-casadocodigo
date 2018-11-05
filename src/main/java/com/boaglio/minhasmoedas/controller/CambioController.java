package com.boaglio.minhasmoedas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boaglio.minhasmoedas.repository.CotacaoRepository;

@Controller
public class CambioController {


	@Autowired
	private CotacaoRepository repository;

	@GetMapping("/cambio")
	public ModelAndView cambio(Model model) {
		ModelAndView modelAndView = new ModelAndView("cambio");

		modelAndView.addObject("averageValue", repository.getAverageValue());
		System.out.println("averageValue = "+repository.getAverageValue());

		modelAndView.addObject("minValue", repository.getMinValue());
		System.out.println("minValue = "+repository.getMinValue());

		modelAndView.addObject("maxValue", repository.getMaxValue());
		System.out.println("maxValue = "+repository.getMaxValue());

		modelAndView.addObject("minDay", repository.getMinDay());
		System.out.println("minDay = "+repository.getMinDay());

		modelAndView.addObject("maxDay", repository.getMaxDay());
		System.out.println("maxDay = "+repository.getMaxDay());

		return modelAndView;
	}

	@GetMapping("/database")
	public ModelAndView database() {

		ModelAndView modelAndView = new ModelAndView("database");

		modelAndView.addObject("database", repository.getMySQLDatabase());
		System.out.println("database = "+repository.getMySQLDatabase());

		return modelAndView;
	}

}
