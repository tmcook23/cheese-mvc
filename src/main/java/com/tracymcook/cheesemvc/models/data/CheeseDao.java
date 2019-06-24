package com.tracymcook.cheesemvc.models.data;

import com.tracymcook.cheesemvc.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> { //DAO stands for Data Access Object
}
