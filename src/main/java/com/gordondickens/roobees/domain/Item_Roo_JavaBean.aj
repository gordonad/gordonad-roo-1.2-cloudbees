// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.gordondickens.roobees.domain;

import com.gordondickens.roobees.domain.Item;

privileged aspect Item_Roo_JavaBean {
    
    public String Item.getName() {
        return this.name;
    }
    
    public void Item.setName(String name) {
        this.name = name;
    }
    
    public String Item.getDescription() {
        return this.description;
    }
    
    public void Item.setDescription(String description) {
        this.description = description;
    }
    
}
