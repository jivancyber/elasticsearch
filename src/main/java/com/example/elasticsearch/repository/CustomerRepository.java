package com.example.elasticsearch.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.example.elasticsearch.model.Customer;

import java.util.List;


public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {
    List<Customer> findByFirstname(String firstName);
}
