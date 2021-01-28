package mikefallonit.workrecord.models;

public class Expenditure {

    private Long id;
    private String date;
    private String expensetype;
    private Job job;

    public Expenditure(String date, String expensetype, Job job) {
        this.date = date;
        this.expensetype = expensetype;
        this.job = job;
    }

    public Expenditure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpensetype() {
        return expensetype;
    }

    public void setExpensetype(String expensetype) {
        this.expensetype = expensetype;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
