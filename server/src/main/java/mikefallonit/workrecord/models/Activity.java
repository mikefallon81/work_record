package mikefallonit.workrecord.models;

public class Activity {

    private Long id;
    private String date;
    private double hours;
    private Job job;
    private String details;

    public Activity(String date, double hours, Job job, String details) {
        this.date = date;
        this.hours = hours;
        this.job = job;
        this.details = details;
    }

    public Activity() {
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
