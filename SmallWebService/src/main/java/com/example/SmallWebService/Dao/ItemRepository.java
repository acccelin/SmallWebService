package com.example.SmallWebService.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SmallWebService.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	Optional<Item> getById(long id);

}
