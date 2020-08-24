package com.Lee.Demo.modules.paramgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.Lee.Demo.entity.ParamGroup;
import com.Lee.Demo.entity.ParamInfo;

import com.Lee.Demo.repository.ParamInfoRepository;
import com.Lee.Demo.repository.ParamRepository;

@Service

public class ServiceParamGroup {
	
	@Autowired
	private ParamRepository ParamRepository;
	
	private ParamInfoRepository infoRepository;
	
	public ParamGroup showid(Long ParamGroupId){
		
		 return ParamRepository.findByParamGroupId(ParamGroupId);
		}
	
	
	public void insert(String paramGroup, String paramEnDescription, String paramLocalDescription) {
		
		ParamGroup group = new ParamGroup();
		
		group.setParamGroup(paramGroup);
		group.setParamEnDescription(paramEnDescription);
		group.setParamLocalDescription(paramLocalDescription);
		ParamRepository.save(group);
		
	}
	

	
	public void delete(Long num) {
		
		ParamGroup group = ParamRepository.findByParamGroupId(num);
		
		group.setIsDeleted("Y");
		ParamRepository.save(group);	
	}
	
	public List<ParamGroup> showN(){
		
		
		return ParamRepository.findByIsDeleted("N");
	}
	
	public List<ParamGroup> findall(){
		return ParamRepository.findAll();
	}

	
}
