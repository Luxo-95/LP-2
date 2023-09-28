package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.modelo.Farmacia;
import com.cibertec.repositorio.FarmaciaRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class FarmaciaController {

    @Autowired
    private FarmaciaRepositorio farmaciaRepositorio;

    @GetMapping("/")
    public String listarMedicamentos(Model model) {
        List<Farmacia> medicamentos = farmaciaRepositorio.findAll();
        model.addAttribute("medicamentos", medicamentos);
        return "listarmedicamentos";
    }

    @GetMapping("/nuevo")
    public String nuevoMedicamento(Model model) {
        model.addAttribute("medicamento", new Farmacia());
        return "nuevo";
    }

    @PostMapping("/guardar")
    public String guardarMedicamento(@ModelAttribute Farmacia medicamento) {
        farmaciaRepositorio.save(medicamento);
        return "redirect:/medicamentos/";
    }

    @GetMapping("/editar/{id}")
    public String editarMedicamento(@PathVariable Integer id, Model model) {
        Farmacia medicamento = farmaciaRepositorio.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de medicamento no válido"));
        model.addAttribute("medicamento", medicamento);
        return "editarmedicamento";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMedicamento(@PathVariable Integer id) {
        farmaciaRepositorio.deleteById(id);
        return "redirect:/medicamentos/";
    }
}

