package br.ufal.ic.srm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "resource")
public class Resource extends Model {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "start", columnDefinition = "date", nullable = false)
	private Date iniDate;

	@Column(name = "finish", columnDefinition = "date", nullable = false)
	private Date endDate;

	@Column(columnDefinition = "boolean", nullable = false)
	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private User user;

	@ManyToOne
	@JoinColumn(name = "activity_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Activity activity;

	@ManyToOne
	@JoinColumn(name = "place_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Place place;

	@ManyToOne
	@JoinColumn(name = "multimedia_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Multimedia multimedia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getIniDate() {
		return iniDate;
	}

	public void setIniDate(Date iniDate) {
		this.iniDate = iniDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List errors() {
		// TODO Auto-generated method stub
		return null;
	}

}
