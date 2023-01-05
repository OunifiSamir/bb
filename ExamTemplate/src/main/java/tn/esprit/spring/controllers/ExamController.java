package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.services.Examservice;

import tn.esprit.spring.services.IExamservice;



@RestController
@RequestMapping("/rest")

public class ExamController {
@Autowired
Examservice examservice;
@Autowired
IExamservice Iexemservice;

//http://localhost:9090/rest/add-Voyage
		@PostMapping("/add-Voyage")
		public void ajouterVoyage(@RequestBody Voyage V) {
			examservice.ajouterVoyage(V);
			}
		//http://localhost:9090/rest/add-Train
		@PostMapping("/add-Train")
		public void ajouterTrain(@RequestBody Train Train) {
			examservice.ajouterTrain(Train);
		
		}
		
}
