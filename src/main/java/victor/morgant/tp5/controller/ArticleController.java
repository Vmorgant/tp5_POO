package victor.morgant.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import victor.morgant.tp5.model.ArticleRepository;


@Controller
public class ArticleController {
	 @Autowired
	    ArticleRepository articleRepository;
    @GetMapping("/article")
    public String greeting(@RequestParam(name="id", required=false, defaultValue="1") String id, Model model) {
       model.addAttribute("article",articleRepository.findById(Long.parseLong(id)).get());
        return "article";
    }
}

