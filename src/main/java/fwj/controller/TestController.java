package fwj.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fwj.entity.User;
import fwj.mapper.UserMapper;

@Controller
@Validated
public class TestController {

	@Autowired
	public UserMapper usermapper;

	@Autowired
	public Haha haha;

	@RequestMapping("/user")
	public String index1() {
		// User user = usermapper.selectByPrimaryKey("fuwenjie");

		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "/indexdo")
	public String user(@Validated @NotNull User user, BindingResult br, Model model) {

		if (br.hasErrors()) {
			return "error";
		}
		return "success";
	}
}
