package in.co.examsadda.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Institute {

	private Long instituteId;
	private String Name;
	private Address address;
	private Date activationDate;
	private Date deactivationDate;
	private Set<Exam> exams;



	/**
	 * 
	 */
	public Institute() {
		exams = new HashSet<Exam>();
	}



	/**
	 * @param instituteId
	 * @param name
	 * @param address
	 * @param activationDate
	 * @param deactivationDate
	 * @param exams
	 */
	public Institute(Long instituteId, String name, Address address, Date activationDate, Date deactivationDate,
			Set<Exam> exams) {
		super();
		this.instituteId = instituteId;
		Name = name;
		this.address = address;
		this.activationDate = activationDate;
		this.deactivationDate = deactivationDate;
		this.exams = exams;
	}



	/**
	 * @return the instituteId
	 */
	public Long getInstituteId() {
		return instituteId;
	}



	/**
	 * @param instituteId the instituteId to set
	 */
	public void setInstituteId(Long instituteId) {
		this.instituteId = instituteId;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}



	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}



	/**
	 * @return the activationDate
	 */
	public Date getActivationDate() {
		return activationDate;
	}



	/**
	 * @param activationDate the activationDate to set
	 */
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}



	/**
	 * @return the deactivationDate
	 */
	public Date getDeactivationDate() {
		return deactivationDate;
	}



	/**
	 * @param deactivationDate the deactivationDate to set
	 */
	public void setDeactivationDate(Date deactivationDate) {
		this.deactivationDate = deactivationDate;
	}



	/**
	 * @return the exams
	 */
	public Set<Exam> getExams() {
		return exams;
	}



	/**
	 * @param exams the exams to set
	 */
	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", Name=" + Name + ", address=" + address + ", activationDate="
				+ activationDate + ", deactivationDate=" + deactivationDate + ", exams=" + exams + "]";
	}

}




