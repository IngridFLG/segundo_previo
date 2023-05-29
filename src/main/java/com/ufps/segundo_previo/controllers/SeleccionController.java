package com.ufps.segundo_previo.controllers;

import com.ufps.segundo_previo.entities.ContinenteEntity;
import com.ufps.segundo_previo.entities.SeleccionEntity;
import com.ufps.segundo_previo.repositories.ContinenteRepository;
import com.ufps.segundo_previo.repositories.SeleccionRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping("/selecciones")
public class SeleccionController {

    @Autowired
    SeleccionRepository seleccionRepository;

    @Autowired
    ContinenteRepository continenteRepository;

    @GetMapping
    public String ListarSeleccion(Model model){
        List<SeleccionEntity> seleccion = seleccionRepository.findAll();
        model.addAttribute("seleccion", seleccion);
        return "list";
    }

    @GetMapping("/mostrar")
    public String mostrarFormulario(@RequestParam(value = "id", required = false) Integer id, Model model) {

        SeleccionEntity seleccion = new SeleccionEntity();

        if(id != null) {
            seleccion = seleccionRepository.findById(id).get();
        }

        List<ContinenteEntity> continente = continenteRepository.findAll();
        model.addAttribute("continente", continente);
        model.addAttribute("seleccion", seleccion);
        return "form";
    }


    @PostMapping("/agregar")
    public String procesarFormulario(@Valid SeleccionEntity seleccion, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        seleccionRepository.save(seleccion);

        return "redirect:/selecciones";
    }

}
