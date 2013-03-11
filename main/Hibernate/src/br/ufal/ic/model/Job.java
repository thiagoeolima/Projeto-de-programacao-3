package br.ufal.ic.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="JOBS")
public class Job implements Serializable {
	@Id
	@Column(columnDefinition="varchar(10)")
	private String id;
	
	@Column(name="job_title",columnDefinition="varchar(35)",nullable=false)
	private String title;
	
	@Column(name="min_salary",columnDefinition="decimal(6,0)")
	private double minSalary;	
	
	@Column(name="max_salary",columnDefinition="decimal(6,0)")
	private double maxSalary;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	private List<Employee> employees;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
	private List<JobHistory> histories;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<JobHistory> getHistories() {
		return histories;
	}

	public void setHistories(List<JobHistory> histories) {
		this.histories = histories;
	}
	
}
