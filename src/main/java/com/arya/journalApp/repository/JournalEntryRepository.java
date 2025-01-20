package com.arya.journalApp.repository;

import com.arya.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JournalEntryRepository extends MongoRepository<JournalEntry,String> {

}


