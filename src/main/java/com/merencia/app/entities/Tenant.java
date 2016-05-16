package com.merencia.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tenants")
@SequenceGenerator(name="seq_tenants", sequenceName="seq_tenants", allocationSize=1)
@Getter
@Setter
public class Tenant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_tenants")
	private Long id;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	@PrePersist
	private void beforePersist(){
		createdAt = new Date();
		updatedAt = createdAt;
	}
	
	@PreUpdate
	private void beforeUpdate(){
		updatedAt = new Date();
	}
}
