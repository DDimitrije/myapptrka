package jwd.knjizara.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jwd.knjizara.model.TakmicenjaGodina;
import jwd.knjizara.model.Trka;
import jwd.knjizara.model.Trkac;


//@Repository
//public interface TrkaRepository extends JpaRepository<Trka, Long>  {
//Page<Trka> findByManfestacijaId( Pageable pageRequest);
	
//	@Query("SELECT k FROM Trka k WHERE "
//			+ "(:ime IS NULL or k.ime like :ime ) AND "
//			+ "(:prezime IS NULL OR k.prezime  like :prezime ) AND "
//			+ "(:pol IS NULL OR k.pol = :pol) AND "
//			+ "(:velicinaMajce IS NULL OR k.velicinaMajce  like :velicinaMajce ) AND "
//			+ "(:adresa IS NULL OR k.adresa  like :adresa ) AND "
//			+ "(:grad IS NULL OR k.grad  like :grad ) AND "
//			+ "(:drzava IS NULL OR k.drzava  like :drzava ) AND "
//			+ "(:najBoljeVreme IS NULL OR k.najBoljeVreme  like :najBoljeVreme ) AND "
//			+ "(:klub IS NULL OR k.klub  like :klub ) "
//			)

//@Repository
//public interface TrkaRepository extends JpaRepository<Trka, Long>  {
//Page<Trka> findByManfestacijaId( Pageable pageRequest);
//	
////	@Query("SELECT k FROM Trka k WHERE "
////			+ "(:ime IS NULL or k.ime like :ime ) AND "
////			+ "(:prezime IS NULL OR k.prezime  like :prezime ) AND "
////			+ "(:pol IS NULL OR k.pol = :pol) AND "
////			+ "(:velicinaMajce IS NULL OR k.velicinaMajce  like :velicinaMajce ) AND "
////			+ "(:adresa IS NULL OR k.adresa  like :adresa ) AND "
////			+ "(:grad IS NULL OR k.grad  like :grad ) AND "
////			+ "(:drzava IS NULL OR k.drzava  like :drzava ) AND "
////			+ "(:najBoljeVreme IS NULL OR k.najBoljeVreme  like :najBoljeVreme ) AND "
////			+ "(:klub IS NULL OR k.klub  like :klub ) "
////			)
////
////	Page<Trkac> pretraga(
////			@Param("ime") String ime, 
////			@Param("prezime") String prezime, 
////			@Param("pol") String pol,
////			@Param("velicinaMajce") String velicinaMajce,
////			@Param("adresa") String adresa,
////			@Param("drzava") String drzava,
////			@Param("najBoljeVreme") String najBoljeVreme,
////			@Param("klub") String klub,
////			Pageable pageRequest);
//
//	@Query("SELECT k FROM Trka k WHERE " + "(:duzinaStaze IS NULL or k.duzinaStaze like :duzinaStaze ) AND "
//			+ "(:kategorija IS NULL OR k.kategorija  like :kategorija ) "

//
//	)
//
//	Page<Trka> pretraga(@Param("duzinaStaze") String duzinaStaze, @Param("kategorija") String kategorija,
//			Pageable pageRequest);
//
//	Page<Trka> findByManifestacijaId(Long manifestacijaId, PageRequest pageRequest); 
//}
@Repository
public interface TrkaRepository extends JpaRepository<Trka, Long> {

//	@Query("SELECT k FROM Trka k WHERE " + "(:duzinaStaze IS NULL or k.duzinaStaze like :duzinaStaze ) AND "
//			+ "(:kategorija IS NULL OR k.kategorija  like :kategorija ) "
//
//	)
//
//	Page<Trka> pretraga(@Param("duzinaStaze") String duzinaStaze, @Param("kategorija") String kategorija,
//			Pageable pageRequest);
//
//	Page<Trka> findByManifestacijaId(Long manifestacijaId, PageRequest pageRequest); 

}

