// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.gordondickens.roobees.repository;

import com.gordondickens.roobees.domain.Item;
import com.gordondickens.roobees.repository.ItemRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect ItemRepository_Roo_Jpa_Repository {
    
    declare parents: ItemRepository extends JpaRepository<Item, Long>;
    
    declare parents: ItemRepository extends JpaSpecificationExecutor<Item>;
    
    declare @type: ItemRepository: @Repository;
    
}
