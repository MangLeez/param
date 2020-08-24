package com.Lee.Demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name ="CPIP_MS_PARAMETER_INFO")

public class ParamInfo {
	
	@Id
    @SequenceGenerator(name = "param_info_id_seq",sequenceName = "CPIP_MS_PARAMETER_INFO_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "param_info_id_seq")
	private Long paramInfoId;
	
	private String paramCode;
	
	private String paramEnDescription;
	
	private String paramLocalDescription;
	
	@ManyToOne
	@JoinColumn(name = "PARAM_GROUP_ID")
	private ParamGroup paramGroupId;
	
	@JsonIgnore
	private String isDeleted = "N";
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@CreationTimestamp
	private Timestamp createdDate;
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@CreatedBy
	private String createdBy = "admin";
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@UpdateTimestamp
	private Timestamp updatedDate;
	
	@Column(updatable = false, insertable = true)
	@JsonIgnore
	@LastModifiedBy
	private String updatedBy = "admin";
	
	@JsonIgnore
	private String specialPurpose;
	
	@JsonIgnore
	private Long sortingOrder;
	
	

}
