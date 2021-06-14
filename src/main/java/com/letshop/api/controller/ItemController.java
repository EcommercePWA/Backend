package com.letshop.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.letshop.api.entity.Item;
import com.letshop.api.service.ItemService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ItemController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}")
    public EntityModel<Item> getItem(@PathVariable long id) {
        Item item = itemService.getItem(id);
        EntityModel<Item> entityModel = EntityModel.of(item);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(ItemController.class).getItems());
        entityModel.add(linkTo.withRel("all-items"));
        return entityModel;
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable long id) {
        itemService.deleteItem(id);
    }


    // https://shopee.sg/search?keyword=pc&order=desc&page=0&sortBy=price
    //
    // @GetMapping("/search")
    // public List<Item> searchItems(@RequestParam String keyword,
    //                               @RequestParam String order,
    //                               @RequestParam String page,
    //                               @RequestParam String sortBy) {
    //     return itemService.findAll();
    // }

}
