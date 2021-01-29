package mikefallonit.workrecord.models;

import javax.persistence.*;

public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;

    @Column(name="hours")
    private double hours;

    @ManyToOne
    @JoinColumn(name="job_id", nullable = false)
    private Job job;

    @Column(name="details")
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
