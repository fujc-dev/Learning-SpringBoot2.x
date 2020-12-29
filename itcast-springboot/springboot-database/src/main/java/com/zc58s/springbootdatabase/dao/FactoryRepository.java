package com.zc58s.springbootdatabase.dao;

import com.zc58s.springbootdatabase.entity.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : fjc.dane@gmail.com
 * @createtime : 2020/12/29 15:59
 * springboot-database
 * com.zc58s.springbootdatabase.dao
 */
@Repository
public interface FactoryRepository extends JpaRepository<Factory, Integer> {
}
