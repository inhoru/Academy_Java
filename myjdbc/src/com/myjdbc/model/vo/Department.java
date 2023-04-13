package com.myjdbc.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	
	private static final long serialVersionUID = -6967519710635139913L;
	private String deptID;
	private String deptTitle;
	private String locationId;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptID, String deptTitle, String locationId) {
		super();
		this.deptID = deptID;
		this.deptTitle = deptTitle;
		this.locationId = locationId;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptTitle() {
		return deptTitle;
	}

	public void setDeptTitle(String deptTitle) {
		this.deptTitle = deptTitle;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptTitle=" + deptTitle + ", locationId=" + locationId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptID, deptTitle, locationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(deptID, other.deptID) && Objects.equals(deptTitle, other.deptTitle)
				&& Objects.equals(locationId, other.locationId);
	}
	
}
