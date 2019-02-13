package com.kapture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@RequestMapping("/")
public class MainController {
	
	@PostMapping("postdata")
	public ResponseEntity<Object> listenData(@RequestBody String str){
		System.out.println(str);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
