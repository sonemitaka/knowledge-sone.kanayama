package jp.co.sss.knowledge_sone.kanayama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.knowledge_sone.kanayama.form.LoginForm;

@Controller
public class IndexController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(LoginForm loginForm) {

		System.out.println("index GET:" + loginForm);

		return "index";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(LoginForm loginForm) {

		System.out.println("index POST:" + loginForm);

		return "redirect:/list";

	}

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout() {

		return "redirect:/";
	}

}
