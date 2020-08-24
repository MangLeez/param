package com.Lee.Demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lee.Demo.entity.ParamGroup;
import com.Lee.Demo.entity.ParamInfo;


@Repository
public interface ParamInfoRepository extends JpaRepository<ParamInfo, Long> {
	
	
	List<ParamInfo>findByParamInfoId(Long paramInfoId);
	
	List<ParamInfo>findByParamGroupId(ParamGroup paramGroupId);
	
	List<ParamInfo>findByIsDeleted(String N);
	
	
	
	
	

}
