package fr.humanbooster.fx.enquetes.Service;

import java.util.List;

import fr.humanbooster.fx.enquetes.business.Fait;

public interface FaitService {

	public List<Fait> recupereFait();
	
	public Fait recupereFait (int id);
}
