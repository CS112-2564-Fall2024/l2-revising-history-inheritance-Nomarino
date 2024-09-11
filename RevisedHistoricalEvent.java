public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;


    public RevisedHistoricalEvent(){
    super();

    this.revisedDescription = "None";
    this.citation = "None";
    }


    public RevisedHistoricalEvent(String description, Date date, String revisedDescription, String citationString) {
        super(description, date);

        this.revisedDescription = revisedDescription;
        this.citation = citationString;
    }
    
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setcitation(String citation) {
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public String getcitation() {
        return citation;
    }


    public String toString() {
        String superString = super.toString();

        return superString + '\n' + '\n' + this.revisedDescription + '\n' + '\n' + this.citation;
    }

    public void teach() {
        System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}
