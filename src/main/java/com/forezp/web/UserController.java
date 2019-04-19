package com.forezp.web;

import com.forezp.Utils.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String userList() {

        ArrayList<String> users = new ArrayList<String>() {
            {
                add("zhouqiang");
                add("yun");
                add("yuping");
            }
        };

        return JSONResult.fillResultString(0,"success",users);
    }
}
