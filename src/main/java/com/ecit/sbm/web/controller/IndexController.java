package com.ecit.sbm.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import sun.misc.Contended;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/index")
public class IndexController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getInputStream();
        response.getWriter();
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
