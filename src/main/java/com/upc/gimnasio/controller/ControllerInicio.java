package com.upc.gimnasio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerInicio {

    @GetMapping({"/","/login"})
    public String login(){
     return "login";
    }
    @GetMapping("menu")
    public String menu(){
        return "menu";
    }
    @GetMapping("registroU")
    public String registroU(){
        return "registro_usuario";
    }
    @GetMapping("registroMA")
    public String registroMA(){
        return "medicion";
    }
    @GetMapping("definicionPlan")
    public String definicionPlan(){
        return "definicion";
    }

}
