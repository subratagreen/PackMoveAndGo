package com.packmoveandgo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIAL_USED")
public class MaterialUsed {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATERIAL_USED_SEQ")
	@SequenceGenerator( name="MATERIAL_USED_SEQ", sequenceName="MATERIAL_USED_SEQ",
	initialValue = 1, allocationSize = 1 )
	private int mat_id;
	
	@Column(name = "pack_mat_id")
	private int pack_mat_id;

	@Column(name = "branch_id")
	private int branch_id;

	@Column(name = "qty")
	private int qty;

	public int getMat_id() {
		return mat_id;
	}

	public void setMat_id(int mat_id) {
		this.mat_id = mat_id;
	}

	public int getPack_mat_id() {
		return pack_mat_id;
	}

	public void setPack_mat_id(int pack_mat_id) {
		this.pack_mat_id = pack_mat_id;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "MaterialUsed [mat_id=" + mat_id + ", pack_mat_id=" + pack_mat_id + ", branch_id=" + branch_id + ", qty="
				+ qty + "]";
	}

	



}
