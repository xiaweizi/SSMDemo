package com.xiaweizi.ssm.controller;

import com.xiaweizi.ssm.model.CommonModel;
import com.xiaweizi.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.ssm.controller.UserController
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/05/25
 *     desc   :
 * </pre>
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public CommonModel login(String name, String password) {
        return userService.login(name, password);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public CommonModel register(String name, String password) {
        return userService.register(name, password);
    }
}
