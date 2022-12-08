package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author p@bloxmith.com
 */
@Entity
@Getter
@Setter
@SuppressWarnings("PersistenceUnitPresent")
@Table(name = "someone")
public class Someone implements Serializable {

	private static final long serialVersionUID = 2405728683513547161L;

	@Basic(optional = false)
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	@Basic(optional = false)
	@Column(nullable = false, length = 128)
	private String name;

	public Someone() {
	}

	public Someone(Integer id) {
		this.id = id;
	}

	public Someone(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Someone)) {
			return false;
		}
		Someone other = (Someone) object;
		return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "com.example.demo.Someone[ id=" + id + " ]";
	}
}
