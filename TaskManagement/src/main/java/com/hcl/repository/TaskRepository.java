package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.pojo.Tmpojo;



@Repository
public interface TaskRepository extends JpaRepository<Tmpojo,Integer>
{

}
