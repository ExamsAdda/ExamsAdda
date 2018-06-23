package in.co.examsadda.model;

import java.util.HashSet;
import java.util.Set;


public class Section implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sectionId;
	private String sectionName;
	private Set<Question> questions;
	
	/**
	 * 
	 */
	public Section() {
		questions = new HashSet<Question>();
	}

	/**
	 * @param sectionId
	 * @param sectionName
	 * @param questions
	 */
	public Section(Long sectionId, String sectionName, Set<Question> questions) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.questions = questions;
	}

	/**
	 * @return the sectionId
	 */
	public Long getSectionId() {
		return sectionId;
	}

	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}

	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/**
	 * @return the questions
	 */
	public Set<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", questions=" + questions + "]";
	}
	
}
