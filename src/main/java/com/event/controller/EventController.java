package com.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.domain.Event;
import com.event.repository.EventRepository;

@RestController
@RequestMapping("events")
public class EventController {

	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping
	public List<Event>getAllEvents(){
		return eventRepository.findAll();
	}

	@GetMapping(path="/{userId}")
	public List<Event>getAllEvents(@PathVariable("userId")String userId){
		return eventRepository.findByUserId(userId);
	}
	
	@PostMapping
	public Event createEvent(@RequestBody Event event){
		return eventRepository.save(event);
	}
}
