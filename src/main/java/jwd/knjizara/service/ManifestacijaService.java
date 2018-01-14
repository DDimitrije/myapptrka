package jwd.knjizara.service;

//import java.util.Date;

//import javax.persistence.Column;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import jwd.knjizara.model.Manifestacija;
//import jwd.knjizara.model.Pivo;

public interface ManifestacijaService {
	Page<Manifestacija> findAll(int pageNum);
	Manifestacija findOne(Long id);
	void save(Manifestacija manifestacija);
	void remove(Long id);
	Page<Manifestacija> findByManifestacijaId(int pageNum, Long manifestacijaId);//pivaraID
	Page<Manifestacija> pretraga(
			@Param("naziv") String naziv, 
			@Param("datumOdrzavanja") String datumOdrzavanja, 
			@Param("mestoOdrzavanja") String mestoOdrzavanja, 
			int page);
	

	

}
