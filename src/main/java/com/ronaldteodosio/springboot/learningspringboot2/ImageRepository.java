package com.ronaldteodosio.springboot.learningspringboot2;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ImageRepository  extends PagingAndSortingRepository <Image, Long>{

public Image findByName(String name);

}
