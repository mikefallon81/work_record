package mikefallonit.workrecord.controllers;

import mikefallonit.workrecord.models.Expenditure;
import mikefallonit.workrecord.repositories.ExpenditureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/expenses")

public class ExpenditureController {

    @Autowired
    ExpenditureRepository expenditureRepository;

    @GetMapping
    public List<Expenditure> getAllExpenditure(){
        return expenditureRepository.findAll();
    }

    @GetMapping("{id")
    public Optional<Expenditure> getExpenditure(@PathVariable Long id){
        return expenditureRepository.findById(id);
    }
}
