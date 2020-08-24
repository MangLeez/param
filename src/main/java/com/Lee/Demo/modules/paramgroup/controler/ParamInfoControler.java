package com.Lee.Demo.modules.paramgroup.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lee.Demo.entity.ParamGroup;
import com.Lee.Demo.entity.ParamInfo;
import com.Lee.Demo.modules.paramgroup.service.ServiceParamInfo;
import com.Lee.Demo.repository.ParamInfoRepository;
import com.Lee.Demo.repository.ParamRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/paraminfo")
@CrossOrigin(origins="*")


public class ParamInfoControler {
	
	@Autowired
	private ParamInfoRepository infoRepository;
	
	@Autowired
	private ServiceParamInfo SPI;
	
	
	
	
	@GetMapping("/findall")
	public List<ParamInfo> findall(){
	 
		return  SPI.findall();
	}

	@GetMapping("/find/{num}")
	public List<ParamInfo> find(@PathVariable Long num){
		
		return SPI.find(num);
	}

	
	@GetMapping("/add/{paramGroupId}/{paramCode}/{paramEnDescription}/{paramLocalDescription}")
	public void insert(@PathVariable ParamGroup paramGroupId, @PathVariable String paramCode, @PathVariable String paramEnDescription, @PathVariable String paramLocalDescription) {
	
		SPI.insert(paramGroupId, paramCode, paramEnDescription, paramLocalDescription);
	
	}
	
	
	@GetMapping("/delete/{num}")
	public void delete(@PathVariable Long num) {
		
		 SPI.delete(num);
		 
	}
	
	@GetMapping("/IsDeleteN")
	public List<ParamInfo> delN(){
		
		
		return SPI.showDeleteN();
	}
	

	@GetMapping("/IsDeleteY")
	public List<ParamInfo> delY(){
		
		return SPI.showDeleteY();
		
	}
	
	@GetMapping("/findparamgroup/{paramGroupId}")
	public List<ParamInfo>  findInfo(@PathVariable ParamGroup paramGroupId){
		
		return SPI.showParamInfo(paramGroupId);
	}
  
	
}
