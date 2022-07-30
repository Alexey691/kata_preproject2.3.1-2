package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.service.UserService;

@Controller
public class UsersController {


    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String getListUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "views/users";
    }

    @GetMapping("views/add")
    public String createAddUserForm(User user, Model model) {
        model.addAttribute("user", user);
        return "/views/adduser";
    }

    @PostMapping("views/add")
    public String addUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        User user = userService.getUser(id);
        userService.delUser(user);
        return "redirect:/";
    }

    @GetMapping("update{id}")
    public String createUpdUserForm(@PathVariable("id") long id, Model model) {
        model.addAttribute(userService.getUser(id));
        return "views/update";
    }

    @PutMapping("update")
    public String updateUser(User user) {
        userService.updUser(user.getId(), user);
        return "redirect:/";
    }


}

