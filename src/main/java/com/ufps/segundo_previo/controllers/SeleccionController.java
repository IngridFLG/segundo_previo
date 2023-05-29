package com.ufps.segundo_previo.controllers;

import com.ufps.segundo_previo.entities.SeleccionEntity;
import com.ufps.segundo_previo.repositories.SeleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/selecciones")
public class SeleccionController {

    @Autowired
    SeleccionRepository seleccionRepository;

    @GetMapping
    public String ListarSeleccion(Model model){
        List<SeleccionEntity> seleccion = seleccionRepository.findAll();
        model.addAttribute("seleccion", seleccion);
        return "list";
    }

}
