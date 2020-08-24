package com.Lee.Demo.modules.paramgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lee.Demo.entity.ParamGroup;
import com.Lee.Demo.entity.ParamInfo;
import com.Lee.Demo.repository.ParamInfoRepository;

@Service

public class ServiceParamInfo {

	@Autowired
	ParamInfoRepository infoRepository;
	
	
	
	public List<ParamInfo> findall(){
		
		return infoRepository.findAll();
	}
	
	public List<ParamInfo> find(Long num) {
		
		return infoRepository.findByParamInfoId(num);
		
	} 
	
	public void insert(ParamGroup paramGroupId, String paramCode, String paramEnDescription, String paramLocalDescription) {
		
		ParamInfo group = new ParamInfo();
		
		group.setParamGroupId(paramGroupId);
		group.setParamCode(paramCode);
		group.setParamEnDescription(paramEnDescription);
		group.setParamLocalDescription(paramLocalDescription);
		infoRepository.save(group);
	}
	
	public void delete(Long num) {
		ParamInfo group = infoRepository.getOne(num);
		
		group.setIsDeleted("Y");
		infoRepository.save(group);
	}
	
	public List<ParamInfo> showDeleteN(){
		
		return infoRepository.findByIsDeleted("N");
	}
	
	public List<ParamInfo> showDeleteY(){
		
		return infoRepository.findByIsDeleted("Y");
	}
	
	public List<ParamInfo> showParamInfo(ParamGroup paramGroupId){
		
		return infoRepository.findByParamGroupId(paramGroupId);
	}
	
	
	
	

}