package com.Lee.Demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "CPIP_MS_PARAMETER_GROUP")

public class ParamGroup {
	
	@Id
    @SequenceGenerator(name = "param_group_id_seq",sequenceName = "CPIP_MS_PARAMETER_GROUP_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "param_group_id_seq")
	private Long paramGroupId;
	
	private String paramGroup;
	
	private String paramEnDescription;
	
	private String paramLocalDescription;
	
	@JsonIgnore
	private String isDeleted = "N";
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@CreationTimestamp
	private Timestamp createdDate;
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@CreatedBy
	private String createdBy ="admin";
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@UpdateTimestamp
	private Timestamp updatedDate; 
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@LastModifiedBy
	private String updatedBy = "admin";
	

	public Long getParamGroupId() {
		return paramGroupId;
	}

	public void setParamGroupId(Long paramGroupId) {
		this.paramGroupId = paramGroupId;
	}

	public String getParamGroup() {
		return paramGroup;
	}

	public void setParamGroup(String paramGroup) {
		this.paramGroup = paramGroup;
	}

	public String getParamEnDescription() {
		return paramEnDescription;
	}

	public void setParamEnDescription(String paramEnDescription) {
		this.paramEnDescription = paramEnDescription;
	}

	public String getParamLocalDescription() {
		return paramLocalDescription;
	}

	public void setParamLocalDescription(String paramLocalDescription) {
		this.paramLocalDescription = paramLocalDescription;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	
}
