package com.talibank.timebank;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/historyApi")
@CrossOrigin(origins = "http://localhost:8081",methods={RequestMethod.GET,RequestMethod.POST})
public class HistoryRESTController {
	
	@Autowired
	HistoryRepository repository;
	
	@GetMapping
	public History getHistory(@RequestParam("email") String email, Model model) {
		Optional<History> history = repository.findById(email);
		if (history.isPresent()) {
			return history.get();
		}
		return null;
	}
	
	@PostMapping(path="/history", consumes="application/json")
	public void inserHistory(@RequestBody History history) {
		repository.save(history);
	}

}
