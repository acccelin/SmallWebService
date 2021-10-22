package com.example.SmallWebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.SmallWebService.Item;
import com.example.SmallWebService.Dao.ItemRepository;


@Controller
@RequestMapping(value = "/ItemPage")
public class ItemController {

	
	@Autowired
	ItemRepository itemRepository;
	
	//add new item
	@RequestMapping(value = "/addItem", method = RequestMethod.GET)
	public Item addItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
	//get all items from DB
	@RequestMapping(value = "/allItem", method = RequestMethod.POST)
	public List<Item> getAll() {
		return itemRepository.findAll();
	}
}
