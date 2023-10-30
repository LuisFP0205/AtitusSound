package br.edu.atitus.atitusound.services;

import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.repositories.GenericRepository;

public interface ArtistService extends GenericService<ArtistEntity> {

	GenericRepository<ArtistEntity> getRepository();

	
	
}
