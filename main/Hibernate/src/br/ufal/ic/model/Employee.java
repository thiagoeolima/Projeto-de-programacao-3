package br.ufal.ic.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="EMPLOYEES")
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name ="first_name",columnDefinition = "varchar(40)",nullable=false)
	private String firstName;
	
	@Column(name ="last_name",columnDefinition = "varchar(25)",nullable=false)
	private String lastName;
	
	@Column(columnDefinition = "varchar(45)")
	private String email;
	
	@Column(name ="phone_number",columnDefinition = "varchar(20)")
	private String number;
	
	@Column(name ="hire_date",columnDefinition = "date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	
	@Column(columnDefinition="decimal(8,2)")
	private double salary;
	
	@Column(columnDefinition="decimal(2,2)")
	private float commision_pct;
	
	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Employee manager;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
	private List<Employee> employees;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
	private List<Departament> departaments;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.employee")
	private List<JobHistory> jobHistories;
	
	
	@ManyToOne
	@JoinColumn(name = "departament_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Departament departament;
	
	@ManyToOne
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Job job;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		if (hireDate != null) {
			this.hireDate = new Date(hireDate.getTime());
	    } else {
	    	this.hireDate = null;
	    }
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getCommision_pct() {
		return commision_pct;
	}

	public void setCommision_pct(float commision_pct) {
		this.commision_pct = commision_pct;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Departament> getDepartaments() {
		return departaments;
	}

	public void setDepartaments(List<Departament> departaments) {
		this.departaments = departaments;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
}
