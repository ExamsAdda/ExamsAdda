package in.co.examsadda.model;

import java.util.HashSet;
import java.util.Set;

public class PracticePaper {
	
	private Long paperId;
	private String paperNameRegional;
	private String paperNameEnglish;
	private Set<Section> sections;
	private Integer timeInMinutes;
	/**
	 * 
	 */
	public PracticePaper() {
		sections = new HashSet<Section>();
	}
	/**
	 * @param paperId
	 * @param paperNameRegional
	 * @param paperNameEnglish
	 * @param sections
	 * @param timeInMinutes
	 */
	public PracticePaper(Long paperId, String paperNameRegional, String paperNameEnglish, Set<Section> sections,
			Integer timeInMinutes) {
		super();
		this.paperId = paperId;
		this.paperNameRegional = paperNameRegional;
		this.paperNameEnglish = paperNameEnglish;
		this.sections = sections;
		this.timeInMinutes = timeInMinutes;
	}
	/**
	 * @return the paperId
	 */
	public Long getPaperId() {
		return paperId;
	}
	/**
	 * @param paperId the paperId to set
	 */
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	/**
	 * @return the paperNameRegional
	 */
	public String getPaperNameRegional() {
		return paperNameRegional;
	}
	/**
	 * @param paperNameRegional the paperNameRegional to set
	 */
	public void setPaperNameRegional(String paperNameRegional) {
		this.paperNameRegional = paperNameRegional;
	}
	/**
	 * @return the paperNameEnglish
	 */
	public String getPaperNameEnglish() {
		return paperNameEnglish;
	}
	/**
	 * @param paperNameEnglish the paperNameEnglish to set
	 */
	public void setPaperNameEnglish(String paperNameEnglish) {
		this.paperNameEnglish = paperNameEnglish;
	}
	/**
	 * @return the sections
	 */
	public Set<Section> getSections() {
		return sections;
	}
	/**
	 * @param sections the sections to set
	 */
	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	/**
	 * @return the timeInMinutes
	 */
	public Integer getTimeInMinutes() {
		return timeInMinutes;
	}
	/**
	 * @param timeInMinutes the timeInMinutes to set
	 */
	public void setTimeInMinutes(Integer timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticePaper [paperId=" + paperId + ", paperNameRegional=" + paperNameRegional + ", paperNameEnglish="
				+ paperNameEnglish + ", sections=" + sections + ", timeInMinutes=" + timeInMinutes + "]";
	}
	
	
}