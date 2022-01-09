package com.rsbettini.clientApplication.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsbettini.clientApplication.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Joao Paulo dos Santos"));
		list.add(new Client(2L, "Pedro Henrique Fernades"));
		list.add(new Client(3L, "Joana Dark da Cruz"));
		return ResponseEntity.ok().body(list);
	}

}
