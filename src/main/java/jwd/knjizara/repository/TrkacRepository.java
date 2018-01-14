package jwd.knjizara.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jwd.knjizara.model.Trkac;
@Repository
public interface TrkacRepository extends JpaRepository<Trkac, Long> {
Page<Trkac> findByTrkacId( Pageable pageRequest);
	
	@Query("SELECT k FROM Trka k WHERE "
			+ "(:duzinaStaze IS NULL or k.duzinaStaze like :duzinaStaze ) AND "
			+ "(:kategorija IS NULL OR k.kategorija  like :kategorija ) "
			
			)

	Page<Trkac> pretraga(
			@Param("duzinaStaze") String duzinaStaze, 
			@Param("kategorija") String kategorija, 
			Pageable pageRequest);
	
}
