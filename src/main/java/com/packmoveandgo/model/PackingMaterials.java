package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PACKING_MATERIALS")
public class PackingMaterials {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PACKING_MATERIALS_SEQ")
	@SequenceGenerator(
		name="PACKING_MATERIALS_SEQ",
		sequenceName="PACKING_MATERIALS_SEQ",
		initialValue = 1, allocationSize = 1
	)
	private int pack_mat_id;
	
	@Column(name = "pack_mat_desc")
	private String	pack_mat_desc;

	@Column(name = "cost_per_unit")
	private int cost_per_unit;

	@Column(name = "mat_id",nullable = false)
	private int mat_id;
	
	

	public int getPack_mat_id() {
		return pack_mat_id;
	}

	public void setPack_mat_id(int pack_mat_id) {
		this.pack_mat_id = pack_mat_id;
	}

	public String getPack_mat_desc() {
		return pack_mat_desc;
	}

	public void setPack_mat_desc(String pack_mat_desc) {
		this.pack_mat_desc = pack_mat_desc;
	}

	public int getCost_per_unit() {
		return cost_per_unit;
	}

	public void setCost_per_unit(int cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}

	public int getMat_id() {
		return mat_id;
	}

	public void setMat_id(int mat_id) {
		this.mat_id = mat_id;
	}

	@Override
	public String toString() {
		return "PackingMaterials [pack_mat_id=" + pack_mat_id + ", pack_mat_desc=" + pack_mat_desc + ", cost_per_unit="
				+ cost_per_unit + ", mat_id=" + mat_id + "]";
	}
	
	
	
}
