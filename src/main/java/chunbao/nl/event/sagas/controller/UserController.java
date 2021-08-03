package chunbao.nl.event.sagas.controller;

import chunbao.nl.event.module.GuiUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-rest")
public class UserController {

    @PostMapping("/insert")
    public String insert(@ModelAttribute GuiUser myUser){
        return "Hello Bitch";
    }
}
