package com.nandolrs.ifrsdev1appv1r2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/category") // This means URL's start with /demo (after Application path)
public class CategoryController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data

    @GetMapping(path="/teste")
    public @ResponseBody String getAllCategories() {
        // This returns a JSON or XML with the users
        return "funcionou";
    }




}
