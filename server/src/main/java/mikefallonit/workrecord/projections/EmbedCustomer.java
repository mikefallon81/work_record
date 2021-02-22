package mikefallonit.workrecord.projections;


import mikefallonit.workrecord.models.Job;
import org.springframework.data.rest.core.config.Projection;


@Projection(name= "embedCustomer", types = Job.class)
public interface EmbedCustomer {
    String getName();
    String getEmail();
    String getContactNumber();
    Job getJob();

}
