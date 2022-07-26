package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {

    @Autowired
    private CarDao carDao;

    @GetMapping(value = "/cars")
    public String getListCars(@RequestParam(value = "count", required = false) Integer count,
                              Model model) {
        //нужно ли заменить на ModelMap?
        if (count == null) {
            model.addAttribute("cars", carDao.getAllCars());
        } else {
            model.addAttribute("cars", carDao.getAllCars(count));
        }

        return "/cars";
    }
}

