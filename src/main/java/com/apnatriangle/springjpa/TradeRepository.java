package com.apnatriangle.springjpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TradeRepository extends CrudRepository<Trade,String> {

    List<Trade> findByBookId(String bookId);

}
