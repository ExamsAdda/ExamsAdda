package in.co.examsadda.vo;

public class Section {

    private Integer sectionId;
    private String sectionDescription;
    private String nameInEnglish;
    private String nameInRegional;
    private Integer numberOfQuestions;
    private Boolean active;
    private Integer practicePaperId;

    /**
     *
     */
    public Section() {
        super();
    }

    public Section(Integer sectionId, String sectionDescription, String nameInEnglish, String nameInRegional, Integer numberOfQuestions, Boolean active, Integer practicePaperId) {
        this.sectionId = sectionId;
        this.sectionDescription = sectionDescription;
        this.nameInEnglish = nameInEnglish;
        this.nameInRegional = nameInRegional;
        this.numberOfQuestions = numberOfQuestions;
        this.active = active;
        this.practicePaperId = practicePaperId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public String getNameInEnglish() {
        return nameInEnglish;
    }

    public void setNameInEnglish(String nameInEnglish) {
        this.nameInEnglish = nameInEnglish;
    }

    public String getNameInRegional() {
        return nameInRegional;
    }

    public void setNameInRegional(String nameInRegional) {
        this.nameInRegional = nameInRegional;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getPracticePaperId() {
        return practicePaperId;
    }

    public void setPracticePaperId(Integer practicePaperId) {
        this.practicePaperId = practicePaperId;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId=" + sectionId +
                ", sectionDescription='" + sectionDescription + '\'' +
                ", nameInEnglish='" + nameInEnglish + '\'' +
                ", nameInRegional='" + nameInRegional + '\'' +
                ", numberOfQuestions=" + numberOfQuestions +
                ", active=" + active +
                ", practicePaperId=" + practicePaperId +
                '}';
    }
}
