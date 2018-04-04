package com.hammertheatre.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO (Data Access Object) - Is a design pattern used to separate low level
 * data accessing operations from high level business logic. CRUD - Acronym for
 * Create, Read, Update and Delete Spring Data JPA provides an implementation
 * for this interface
 */
@Transactional
public interface FormResponseDao extends CrudRepository<FormResponse, Long> {

	/**
	 * Additional query operations can be created here and automatically
	 * implemented by Spring Data JPA See
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details 
	 * (3.4.2 Query Creation)
	 */
	List<FormResponse> findByMarketingArea(String marketingArea);
}
