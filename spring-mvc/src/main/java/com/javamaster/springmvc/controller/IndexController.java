package com.javamaster.springmvc.controller;

import com.javamaster.springmvc.imp.EspecialidadImp;
import com.javamaster.springmvc.model.Especialidad;

import com.javamaster.springmvc.model.Mascota;
import com.javamaster.springmvc.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    EspecialidadImp especialidadImp = new EspecialidadImp();
    // metodo que se encarga de cargar los datos de mascotas del hospital en pantalla

    @RequestMapping("/allEspecialiades")
    public String listMascotas(Model model){
        List<Especialidad> especialidades = especialidadImp.findAll();
        for (Especialidad i: especialidades) {
            System.out.println(i.getName());
        }
        model.addAttribute("especialidades",especialidades);
        return "especialidades";
    }
    // metodo que se encarga de cargar los datos de servicios del hospital en pantalla
    @RequestMapping("/servicios")
    public String servicios(Model model){

        return "servicios";
    }

    // metodo que se encarga de cargar los datos de clientes y sus mascotas del hospital en pantalla
    @RequestMapping("/Cliente-mascota")
    public String cliente_mascota(Model model){

        return "cliente_mascota";
    }
    // metodo que se encarga de cargar los datos de facturas del hospital en pantalla
    @RequestMapping("/factura-cliente")
    public String facturas_clientes(Model model){

        return "factura_cliente";
    }
    // metodo que se encarga de cargar los datos de productos del hospital en pantalla
    @RequestMapping("/producto")
    public String producto(Model model){

        return "productos";
    }
}
