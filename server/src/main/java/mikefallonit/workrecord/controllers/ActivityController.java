package mikefallonit.workrecord.controllers;

import mikefallonit.workrecord.models.Activity;
import mikefallonit.workrecord.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/activities")

public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

    @GetMapping
    public List<Activity> getAllActivities(){
        return activityRepository.findAll();
    }

    @GetMapping("{id")
    public Optional<Activity> getActivity(@PathVariable Long id){
        return activityRepository.findById(id);
    }


}
