package com.jesusdias.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesusdias.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/api")
public class Resources {
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> findAll() {
		User jesus = new User("1", "Jesus Dias", "jesus@dias.com");
		User marcos = new User("2", "Marcos Castro", "marcos@castro.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(jesus, marcos));
		return ResponseEntity.ok().body(list);
	}
	
}
