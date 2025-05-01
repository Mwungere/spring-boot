package com.elite;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SofwareEngineerService sofwareEngineerService;

    public SoftwareEngineerController(SofwareEngineerService sofwareEngineerService) {
        this.sofwareEngineerService = sofwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return sofwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(
            @PathVariable Integer id
    ) {

        return sofwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(
            @RequestBody SoftwareEngineer softwareEngineer
    ) {
        sofwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
