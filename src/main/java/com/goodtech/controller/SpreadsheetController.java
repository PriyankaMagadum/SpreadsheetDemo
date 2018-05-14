package com.goodtech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goodtech.service.SpreadsheetService;

@RestController
@RequestMapping("/spreadSheetController")
public class SpreadsheetController {

	@Autowired
	private SpreadsheetService service;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Integer getdata(HttpServletRequest request) {

		return service.getListFromExcel();
	}

}
