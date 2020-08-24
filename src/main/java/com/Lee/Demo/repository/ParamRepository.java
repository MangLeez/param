package com.Lee.Demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lee.Demo.entity.ParamGroup;


@Repository
public interface ParamRepository extends JpaRepository<ParamGroup, Long> {
	
	ParamGroup findByParamGroupId(Long num);
	
	
	
	List<ParamGroup>findByIsDeleted(String N);
	


}





