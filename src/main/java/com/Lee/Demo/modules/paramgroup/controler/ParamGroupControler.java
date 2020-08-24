package com.Lee.Demo.modules.paramgroup.controler;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lee.Demo.entity.ParamGroup;
import com.Lee.Demo.entity.ParamInfo;
import com.Lee.Demo.modules.paramgroup.service.ServiceParamGroup;
import com.Lee.Demo.repository.ParamRepository;

import java.util.*;

import antlr.CppCodeGenerator;
import javassist.expr.NewArray;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/paramgroup")
@CrossOrigin(origins="*")
public class ParamGroupControler {
	
	@Autowired
	private ServiceParamGroup SPG;
	
	@GetMapping("findall")
	public List<ParamGroup> findall(){
		return SPG.findall();
		
	}
	
	@GetMapping("/show/{ParamGroupId}")
	public	ParamGroup find(@PathVariable Long ParamGroupId){
		
		return SPG.showid(ParamGroupId);
	}
	
	@GetMapping("/add/{paramGroup}/{paramEnDescription}/{paramLocalDescription}")
	public void insert(@PathVariable String paramGroup, @PathVariable String paramEnDescription, @PathVariable String paramLocalDescription) {		
		
		SPG.insert(paramGroup, paramEnDescription, paramLocalDescription);
	}
	
	@GetMapping("/delete/{num}")
	public void delete(@PathVariable Long num) {
		
		 SPG.delete(num);
	}
	
	@GetMapping("/isdeleteN")
	public List<ParamGroup>  findN(){
		
		return SPG.showN();
	}
	

	
	
	
}
