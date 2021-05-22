package com.letshop.api.controller;

import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.letshop.api.entity.Item;
import com.letshop.api.exception.ItemNotFoundException;
import com.letshop.api.repository.ItemRepository;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    // https://shopee.sg/search?keyword=pc&order=desc&page=0&sortBy=price

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/items/{id}")
    public EntityModel<Item> getItem(@PathVariable long id) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));

        EntityModel<Item> entityModel = EntityModel.of(item);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(ItemController.class).getItems());
        entityModel.add(linkTo.withRel("all-items"));
        return entityModel;
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable long id) {
        itemRepository.deleteById(id);
    }

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String keyword,
                                  @RequestParam String order,
                                  @RequestParam String page,
                                  @RequestParam String sortBy) {
        return itemRepository.findAll();
    }

}
