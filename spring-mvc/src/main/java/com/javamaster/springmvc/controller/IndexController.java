package com.javamaster.springmvc.controller;

import com.javamaster.springmvc.imp.EspecialidadImp;
import com.javamaster.springmvc.model.Especialidad;

import com.javamaster.springmvc.model.Mascota;
import com.javamaster.springmvc.repository.MascotaRepository;
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

    @RequestMapping("/allEspecialiades")
    public String listMascotas(Model model){
        EspecialidadImp especialidadImp = new EspecialidadImp();
        List<Especialidad> especialidades = especialidadImp.findAll();
        model.addAttribute("especialidades",especialidades);
        return "mascotas";
    }
}
