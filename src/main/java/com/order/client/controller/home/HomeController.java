package com.order.client.controller.home;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RequestMapping("/")
@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("")
    public ModelAndView home() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("model", "test");
        modelAndView.setStatus(HttpStatus.OK);
        modelAndView.setViewName("index");

        return modelAndView;
    }

}
