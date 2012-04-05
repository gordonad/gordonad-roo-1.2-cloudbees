package com.gordondickens.roobees.web;

import com.gordondickens.roobees.domain.Item;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/items")
@Controller
@RooWebScaffold(path = "items", formBackingObject = Item.class)
public class ItemController {
}
