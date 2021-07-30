package com.billcom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.billcom.api.beans.Article;
import com.billcom.api.service.ArticleService;

@RestController
@RequestMapping("/billcom")
public class ArticleController {
	@Autowired
	private ArticleService service;

	@RequestMapping("/")
	public List<Article> viewHomePage(Model model) {
		List<Article> listArticles = service.listAll();
		model.addAttribute("listArticles", listArticles);

		return listArticles;
	}

	@RequestMapping("/new")
	public String showNewArticlePage(Model model) {
		Article Article = new Article();
		model.addAttribute("Article", Article);

		return "new_Article";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveArticle(@ModelAttribute("Article") Article Article) {
		service.save(Article);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditArticlePage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_Article");
		Article Article = service.get(id);
		mav.addObject("Article", Article);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteArticle(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
}
