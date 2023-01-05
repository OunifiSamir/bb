package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;

@Entity
@Data
public class Voyage implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVoyage;
	private long codeVoyage;
	@Enumerated(EnumType.STRING)
	private Ville gareDepart;
	@Enumerated(EnumType.STRING)
	private Ville  gareArrive;
	private double heureDepart;
	private double heurearrive;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	@Temporal(TemporalType.DATE)
	private Date dateArrive;
	@ManyToOne (cascade = CascadeType.ALL)
	 Train train ;
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL) 
	private List<Voyageur> voyageurs;


}
