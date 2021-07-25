package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UsrHomeController {
	private int count;
	private int count2;

	public UsrHomeController() {
		count = -1;
		count2 = 0;
	}

	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}

	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";

	}

	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또 만나요 .";

	}

	@RequestMapping("/usr/home/main4")
	@ResponseBody
	public int showMain4() {

		return count++;

	}

	@RequestMapping("/usr/home/main5")
	@ResponseBody
	public String showMain5() {

		count = 0;
		return "count의 값이 0으로 초기화 되었습니다.";

	}

	@RequestMapping("/usr/home/getCount")
	@ResponseBody

	public int getCount() {

		return count;
		
	}

	@RequestMapping("/usr/home/dosetCount")
	@ResponseBody

	public String dosetCount(int count, int count2) {

		this.count = count;
		return "count의 값이 " + this.count + " 으로 초기화 되었습니다. ";

	}
}
