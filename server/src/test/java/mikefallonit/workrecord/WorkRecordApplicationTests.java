package mikefallonit.workrecord;

import mikefallonit.workrecord.models.Job;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import mikefallonit.workrecord.repositories.JobRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkRecordApplicationTests {

	@Autowired
	JobRepository jobRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createJob(){
		Job job1 = new Job("Joanna Fallon", 20.00, 10);
		jobRepository.save(job1);
		assertEquals(1, jobRepository.count());
	}

}
