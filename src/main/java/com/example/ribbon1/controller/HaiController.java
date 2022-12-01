package com.example.ribbon1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HaiController {

	@GetMapping(value = "/hai")
	public ResponseHai printHai()
	{
		String str = "hai";
		ResponseHai resHai = new ResponseHai();
		resHai.setStr(str);
		return resHai;
	}
}
