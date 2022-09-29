package com.srini.spring.sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductMVCController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("productList", repository.findAll());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "newproduct";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("employee") Product product) {
        repository.save(product);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String update(@PathVariable(value = "id") long id, Model model) {
        Product product = repository.getById(id);
        model.addAttribute("product", product);
        return "updateproduct";
    }

    @GetMapping("/delete/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        repository.deleteById(id);
        return "redirect:/";

    }


}
