package com.example.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners (AuditingEntityListener.class)
public class BaseEntity {
	@CreatedBy
	@Column(updatable=false)
	private String createdBy;
	@CreatedDate
	@Column(updatable=false)
	private LocalDateTime createdDate;
	@LastModifiedBy
	private String updatedBy;
	@LastModifiedDate
	private LocalDateTime updatedDate;
	private Boolean isActive=true;
	
	public  String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy=createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate=createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedDate(String updatedBy) {
		this.updatedBy=updatedBy;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate=updatedDate;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive=isActive;
	}

}
