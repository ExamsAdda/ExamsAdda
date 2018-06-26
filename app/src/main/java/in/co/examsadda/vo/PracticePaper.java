package in.co.examsadda.vo;


public class PracticePaper {

    private Integer paperId;
    private String paperNameInEnglish;
    private String paperNameInRegional;
    private Integer duration;
    private Integer courseId;
    private Boolean active;


    public PracticePaper() {
    }

    public PracticePaper(Integer paperId, String paperNameInEnglish, String paperNameInRegional, Integer duration, Integer courseId, Boolean active) {
        this.paperId = paperId;
        this.paperNameInEnglish = paperNameInEnglish;
        this.paperNameInRegional = paperNameInRegional;
        this.duration = duration;
        this.courseId = courseId;
        this.active = active;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperNameInEnglish() {
        return paperNameInEnglish;
    }

    public void setPaperNameInEnglish(String paperNameInEnglish) {
        this.paperNameInEnglish = paperNameInEnglish;
    }

    public String getPaperNameInRegional() {
        return paperNameInRegional;
    }

    public void setPaperNameInRegional(String paperNameInRegional) {
        this.paperNameInRegional = paperNameInRegional;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "PracticePaper{" +
                "paperId=" + paperId +
                ", paperNameInEnglish='" + paperNameInEnglish + '\'' +
                ", paperNameInRegional='" + paperNameInRegional + '\'' +
                ", duration=" + duration +
                ", courseId=" + courseId +
                ", active=" + active +
                '}';
    }
}
