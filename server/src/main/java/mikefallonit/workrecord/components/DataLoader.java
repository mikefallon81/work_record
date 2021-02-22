package mikefallonit.workrecord.components;

import mikefallonit.workrecord.models.Customer;
import mikefallonit.workrecord.models.Job;
import mikefallonit.workrecord.repositories.ActivityRepository;
import mikefallonit.workrecord.repositories.CustomerRepository;
import mikefallonit.workrecord.repositories.ExpenditureRepository;
import mikefallonit.workrecord.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    ExpenditureRepository expenditureRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ActivityRepository activityRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){
        Customer paulFallonPlumbing = new Customer("Paul Fallon Plumbing & Heating", "pffallon@hotmail.com", "07977423126");
        customerRepository.save(paulFallonPlumbing);
        Customer johnWastle = new Customer("John Wastle", "wastles@btinternet.com", "07543663287");
        customerRepository.save(johnWastle);

       Job job1 = new Job("IT","15/01/2021", "Laptop fan failed", paulFallonPlumbing, 40.00, "17/02/2021", "15/01/2021");
       jobRepository.save(job1);
       Job job2 = new Job("IT", "25/11/2020", "Laptop battery & PC Slow", johnWastle, 100.00, "30/11/2021", "30/11/2021" );
       jobRepository.save(job2);
       Job job3 = new Job("IT", "24/01/2021","Website Hosting & Office Subscription", paulFallonPlumbing, 46.00, "24/01/2021", "24/01/2021");
       jobRepository.save(job3);
       Job job4 = new Job("Labouring", "20/02/2021", "Insulating Pipes @ Durward Grove", paulFallonPlumbing, 80.00, "20/02/2021", "Unpaid" );
       jobRepository.save(job4);
        Job job5 = new Job("Labouring", "06/02/2021", "Clear Tiles & Insulate Pipes (loft) @ Durward Grove", paulFallonPlumbing, 40.00, "06/02/2021", "17/02/2021" );
        jobRepository.save(job5);


    }

}
