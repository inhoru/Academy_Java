package com.bs.model.dto;

import java.util.Objects;

public class Job {
	private String jobCode;
	private String jobName;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(String jobCode, String jobName) {
		super();
		this.jobCode = jobCode;
		this.jobName = jobName;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jocCode) {
		this.jobCode = jocCode;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "Job [jocCode=" + jobCode + ", jobName=" + jobName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jobName, jobCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		return Objects.equals(jobName, other.jobName) && Objects.equals(jobCode, other.jobCode);
	}
	
	

}