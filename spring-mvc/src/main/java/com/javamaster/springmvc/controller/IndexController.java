package com.javamaster.springmvc.controller;

import com.javamaster.springmvc.model.Masco;
import com.javamaster.springmvc.model.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {


//    @GetMapping("/allMascotas")
//    public String allMascotas(){
//        return "mascotas";
//    }

    @RequestMapping("/allMascotas")
    public String listMascotas(Model model){
        ArrayList<Masco> mascos = new ArrayList<>();
        mascos.add(new Masco(1,"perro","xecec","1212122"));
        mascos.add(new Masco(3,"gato","xeccecfec","1212122"));
        model.addAttribute("mascotas",mascos);
        return "mascotas";
    }
}
