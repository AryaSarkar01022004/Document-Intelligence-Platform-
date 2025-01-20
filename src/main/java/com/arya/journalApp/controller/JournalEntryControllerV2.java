package com.arya.journalApp.controller;

import com.arya.journalApp.entity.JournalEntry;
import com.arya.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private  JournalEntryService journalEntryService;



    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable String myId){
        return null;

    }
    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable String myId){
        return null;
    }

    @PutMapping
    public JournalEntry updateJournalById(@PathVariable String id,@RequestBody JournalEntry myEntry){
        return null;
    }

}
