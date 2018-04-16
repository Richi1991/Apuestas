/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.febrero18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ricardo
 */

@Controller
@RequestMapping("ajax")
public class AjaxController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "ajax/index";
    }
}
