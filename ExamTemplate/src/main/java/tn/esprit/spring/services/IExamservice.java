package tn.esprit.spring.services;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;



@Service
public interface IExamservice {
	public void ajouterVoyage(Voyage V);
	public void ajouterTrain(Train Train);
	
	public void affecterTrainVoyage(long idTrain, long voyage);
	
	
	}
