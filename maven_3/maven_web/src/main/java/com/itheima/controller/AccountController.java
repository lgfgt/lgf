package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @RequestMapping("/findAll.do")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "success";
    }
    @RequestMapping("/deleteAccountById.do")
    public String deleteAccountById(HttpServletRequest request){
        String uid = request.getParameter("id");
        Integer id=Integer.parseInt(uid);
        accountService.deleteAccountById(id );
        return "good";
    }
}
