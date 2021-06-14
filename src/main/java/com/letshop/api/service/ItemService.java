package com.letshop.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.letshop.api.entity.Item;
import com.letshop.api.exception.ItemNotFoundException;
import com.letshop.api.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item getItem(long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public List<Item> findByCategory(String category) {
        return itemRepository.findAllByCategory(category);
    }

    public void deleteItem(long id) {
        itemRepository.deleteById(id);
    }

}
