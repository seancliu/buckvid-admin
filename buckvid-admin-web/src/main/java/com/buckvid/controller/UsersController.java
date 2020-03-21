package com.buckvid.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.buckvid.bean.AdminUser;
import com.buckvid.pojo.BuckvidUsers;
import com.buckvid.service.UsersService;
import com.buckvid.utils.BuckvidJSONResult;
import com.buckvid.utils.PagedResult;

@Controller
@RequestMapping("users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/showList")
	public String showList() {
		return "users/usersList";
	}
	
	@PostMapping("/list")
	@ResponseBody
	public PagedResult list(BuckvidUsers user , Integer page) {
		
		PagedResult result = usersService.queryUsers(user, page == null ? 1 : page, 10);
		return result;
	}
	

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("login")
	@ResponseBody
	public BuckvidJSONResult userLogin(String username, String password,
			HttpServletRequest request, HttpServletResponse response) {
		
		// TODO 模拟登陆
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return BuckvidJSONResult.errorMap("Username and password cannot be blank");
		} else if (username.equals("admin") && password.equals("admin")) {
			
			String token = UUID.randomUUID().toString();
			AdminUser user = new AdminUser(username, password, token);
			request.getSession().setAttribute("sessionUser", user);
			return BuckvidJSONResult.ok();
		}
		
		return BuckvidJSONResult.errorMsg("Please try again.");
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("sessionUser");
		return "login";
	}
	
}
