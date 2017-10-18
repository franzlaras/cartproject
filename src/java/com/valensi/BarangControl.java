/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.model.BarangData;
import com.valensi.service.BarangService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/barang")

public class BarangControl {
    
    @Autowired
    BarangService bs;
    
    @RequestMapping(value = "/all")
    public String barangPage(Model model){
        List<BarangData> brg = bs.findAll();
        model.addAttribute("brg", brg);
        return "barang";
    }
    
    @RequestMapping(value = "/{barangId}")
    public String getDetail(@PathVariable Integer barangId, HttpSession session){
        BarangData brgData = bs.findById(barangId);
        session.setAttribute("brgData", brgData);
       return "detailbarang";
    }
    
    @RequestMapping(value = "/add")
    public String addCart(Model model){
        
        return "keranjang";
    }
    
}
