public class HistoricalEvent {
    protected String description;
    protected Date date;

    public HistoricalEvent() {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.date.toString() + ": " + this.description;
    }

    public void teach() {
        System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}