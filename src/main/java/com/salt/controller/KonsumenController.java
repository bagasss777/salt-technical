package com.salt.controller;

import com.salt.dto.KonsumenDto;
import com.salt.service.KonsumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class KonsumenController {
    @Autowired
    private KonsumenService konsumenService;

    @GetMapping(value = {"/","/add"})
    public String showForm(Map<String, Object> model) {
        model.put("konsumen", new KonsumenDto());
        return "konsumen-form";
    }
    @PostMapping("/home")
    public String saveData
            (@ModelAttribute("konsumen") KonsumenDto konsumenDto) {
        konsumenService.create(konsumenDto);
        return "redirect:/list";
    }
    @GetMapping("/list")
    public String listData(Model model) {
        List<KonsumenDto> konsumenList = konsumenService.getAll();
        model.addAttribute("konsumenList", konsumenList);
        return "konsumen-list";
    }
    @PostMapping("/delete")
    public String deleteData(@RequestParam("id") String id) {
        konsumenService.delete(Long.parseLong(id));
        return "redirect:/list";
    }
    @GetMapping("/edit")
    public String editData(
            @RequestParam("id") String id, Map<String, Object> model) {
        KonsumenDto konsumenDTO = konsumenService
                .edit(Long.parseLong(id));
        model.put("konsumen", konsumenDTO);
        return "konsumen-form";
    }

}
