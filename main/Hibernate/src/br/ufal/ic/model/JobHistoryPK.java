package br.ufal.ic.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Embeddable
public class JobHistoryPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "employee_id",nullable=false)
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	@Column(name="start_date",columnDefinition="date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date start_date;
}
