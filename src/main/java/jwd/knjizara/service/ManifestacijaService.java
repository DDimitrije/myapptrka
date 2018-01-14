package jwd.knjizara.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import jwd.knjizara.model.Manifestacija;

public interface ManifestacijaService {
	Page<Manifestacija> findAll(int pageNum);
	Manifestacija findOne(Long id);
	void save(Manifestacija manifestacija);
	void remove(Long id);
	//Page<Manifestacija> findByManifestacijaId(int pageNum, Long manifestacijaId);//pivaraID
	Page<Manifestacija> findByTakmicenjaGodinaId(int pageNum, Long takmicenjaGodinaId);
	Page<Manifestacija> pretraga(
			@Param("naziv") String naziv, 
			@Param("datumOdrzavanja") Date datumOdrzavanja, 
			@Param("mestoOdrzavanja") String mestoOdrzavanja, 
			int page);
	//List<Manifestacija> findAll();
	//Page<Manifestacija> pretraga(String naziv, Date datumOdrzavanja, String mestoOdrzavanja, int page);
	//Page<Manifestacija> findByTakmicenjaGodinaId(int pageNum, Long takmicenjaGodinaId);
	
//	Page<Pivo> findAll(int pageNum);
//	Pivo findOne(Long id);
//	void save(Pivo pivo);
//	void remove(Long id);
//	Page<Pivo> findByPivaraId(int pageNum, Long pivaraId);
//	Page<Pivo> pretraga(
//			@Param("naziv") String naziv, 
//			//@Param("vrsta") String vrsta, 
//			@Param("minI") Double minI, 
//			@Param("maxI") Double maxI,
////			@Param("maxKolicina") Integer maxKolicina,
//			@Param("pivaraNaziv") String pivaraNaziv,
//			@Param("kolicina") Integer kolicina,
//			int page);
//	

}
