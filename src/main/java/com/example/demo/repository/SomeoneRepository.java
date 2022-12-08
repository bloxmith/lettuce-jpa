package com.example.demo.repository;

import com.example.demo.entity.Someone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author p@bloxmith.com
 */
@Repository
public interface SomeoneRepository extends JpaRepository<Someone, Integer> {

}
