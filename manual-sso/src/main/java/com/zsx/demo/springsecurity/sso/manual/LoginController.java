package com.zsx.demo.springsecurity.sso.manual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * This is {@link LoginController}.
 *
 * @author Zhang Shixu
 * @since 0.0.1
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    String index(HttpSession session) {
        return "Hello World!";
    }

    @RequestMapping("/order")
    @ResponseBody
    String order(HttpSession session) {
        return "Hello World!";
    }

}
