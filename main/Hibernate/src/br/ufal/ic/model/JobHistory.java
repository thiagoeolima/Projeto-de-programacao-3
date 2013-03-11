package br.ufal.ic.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="JOB_HISTORY")
public class JobHistory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JobHistoryPK getId() {
		return id;
	}

	public void setId(JobHistoryPK id) {
		this.id = id;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	@EmbeddedId()  
	private JobHistoryPK id;
	
	@Column(name="end_date",columnDefinition="date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "departament_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Departament departament;
	
	@ManyToOne
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Job job;
	
	
	
}
