package com.talibank.timebank;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



//https://developer.mozilla.org/es/docs/Web/HTTP/Access_control_CORS
@RestController
@RequestMapping("/webapi")
@CrossOrigin(origins = "http://localhost:8081",methods={RequestMethod.GET,RequestMethod.POST})
public class UserRESTController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping("/users")
	public Iterable<User> findAll() {
		return repository.findAll();
	}

}
