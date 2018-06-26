package in.co.examsadda.vo;


public class Question {

    private Integer questionId;
    private String questionInEnglish;
    private String questionInRegional;
    private String questionImageInEnglishURL;
    private String questionImageInRegionalURL;
    private Integer numberOfOptions;
    private Boolean isQuestionHasImage;
    private Character answer;
    private Integer sectionId;
    private Boolean active;

    public Question() {

    }

    public Question(Integer questionId, String questionInEnglish, String questionInRegional, String questionImageInEnglishURL, String questionImageInRegionalURL, Integer numberOfOptions, Boolean isQuestionHasImage, Character answer, Integer sectionId, Boolean active) {
        this.questionId = questionId;
        this.questionInEnglish = questionInEnglish;
        this.questionInRegional = questionInRegional;
        this.questionImageInEnglishURL = questionImageInEnglishURL;
        this.questionImageInRegionalURL = questionImageInRegionalURL;
        this.numberOfOptions = numberOfOptions;
        this.isQuestionHasImage = isQuestionHasImage;
        this.answer = answer;
        this.sectionId = sectionId;
        this.active = active;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionInEnglish() {
        return questionInEnglish;
    }

    public void setQuestionInEnglish(String questionInEnglish) {
        this.questionInEnglish = questionInEnglish;
    }

    public String getQuestionInRegional() {
        return questionInRegional;
    }

    public void setQuestionInRegional(String questionInRegional) {
        this.questionInRegional = questionInRegional;
    }

    public String getQuestionImageInEnglishURL() {
        return questionImageInEnglishURL;
    }

    public void setQuestionImageInEnglishURL(String questionImageInEnglishURL) {
        this.questionImageInEnglishURL = questionImageInEnglishURL;
    }

    public String getQuestionImageInRegionalURL() {
        return questionImageInRegionalURL;
    }

    public void setQuestionImageInRegionalURL(String questionImageInRegionalURL) {
        this.questionImageInRegionalURL = questionImageInRegionalURL;
    }

    public Integer getNumberOfOptions() {
        return numberOfOptions;
    }

    public void setNumberOfOptions(Integer numberOfOptions) {
        this.numberOfOptions = numberOfOptions;
    }

    public Boolean getQuestionHasImage() {
        return isQuestionHasImage;
    }

    public void setQuestionHasImage(Boolean questionHasImage) {
        isQuestionHasImage = questionHasImage;
    }

    public Character getAnswer() {
        return answer;
    }

    public void setAnswer(Character answer) {
        this.answer = answer;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionInEnglish='" + questionInEnglish + '\'' +
                ", questionInRegional='" + questionInRegional + '\'' +
                ", questionImageInEnglishURL='" + questionImageInEnglishURL + '\'' +
                ", questionImageInRegionalURL='" + questionImageInRegionalURL + '\'' +
                ", numberOfOptions=" + numberOfOptions +
                ", isQuestionHasImage=" + isQuestionHasImage +
                ", answer=" + answer +
                ", sectionId=" + sectionId +
                ", active=" + active +
                '}';
    }
}
