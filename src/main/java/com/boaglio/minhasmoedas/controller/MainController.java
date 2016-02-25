package com.boaglio.minhasmoedas.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boaglio.minhasmoedas.type.Paginas;

@Controller
public class MainController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		return Paginas.home.name();
	}

	@RequestMapping(value = "/entrar", method = RequestMethod.GET)
	public String entrarPage(Model model) {
		return Paginas.entrar.name();
	}

	@RequestMapping(value = "/sobre", method = RequestMethod.GET)
	public String sobre() {
		return Paginas.sobre.name();
	}

	@RequestMapping(value = "/sairComSucesso", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		return Paginas.sairComSucesso.name();
	}

	@RequestMapping(value = "/cambio", method = RequestMethod.GET)
	public String entrarPage(Model model, Principal principal) {

		String usuario = principal.getName();

		model.addAttribute("usuario", usuario);

		return Paginas.cambio.name();
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		model.addAttribute("msg", "Acesso negado!");

		return Paginas.acessoNegado.name();
	}
}