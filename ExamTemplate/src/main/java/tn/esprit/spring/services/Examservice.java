package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.TrainRepository;
import tn.esprit.spring.repository.VoyageRepository;

@Service
public class Examservice implements IExamservice {
	@Autowired
	TrainRepository trainrepository;
	@Autowired
	VoyageRepository voyagerepository;
	@Override
	public void ajouterVoyage(Voyage V) {
		voyagerepository.save(V);
		
	}
	@Override
	public void ajouterTrain(Train Train) {
		trainrepository.save(Train);
		
	}
	@Override
	public void affecterTrainVoyage(long idTrain, long voyage) {
		
		
	}
}
