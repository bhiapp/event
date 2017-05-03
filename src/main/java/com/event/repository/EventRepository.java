package com.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	public List<Event>findByUserId(String userId);

}
