/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beranda")

public class HomeController {
    

    
    @RequestMapping()
    public String homePage(HttpSession session,Model model){
//        UserService us = new UserService();
//        UserData user = us.findById(1);
        model.addAttribute("msg", "ini home page");
        return "beranda";
    }
}
