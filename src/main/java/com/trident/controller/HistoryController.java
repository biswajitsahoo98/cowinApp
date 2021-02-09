package com.trident.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trident.entity.History;
import com.trident.service.HistoryService;

@CrossOrigin
@Controller
@RequestMapping("/history")
public class HistoryController 
{
	@Autowired
	private HistoryService historyService;
	
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<History> findAll(Model model)
	{
		List<History> history = historyService.findAll();
		return history;
	}
	
	@RequestMapping(value="/find/{aadhar}", method = RequestMethod.GET)
	@ResponseBody
	public History find(@PathVariable("aadhar") String aadhar)
	{
		History history = historyService.find(aadhar);
		return history;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("History") History history)
	{
		historyService.save(history);
		return "sucess";
	}
	
}