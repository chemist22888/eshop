package com.asavin.eshop.repository;

import com.asavin.eshop.Entity.Watch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends CrudRepository<Watch,Long> {
}
