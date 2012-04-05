package com.gordondickens.roobees.repository;

import com.gordondickens.roobees.domain.Item;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Item.class)
public interface ItemRepository {
}
