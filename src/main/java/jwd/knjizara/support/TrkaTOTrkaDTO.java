package jwd.knjizara.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.knjizara.model.Trka;
import jwd.knjizara.web.dto.TrkaDTO;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import jwd.knjizara.model.Trka;
//import jwd.knjizara.web.dto.TrkaDTO;
//
//@Component
//public class TrkaTOTrkaDTO implements Converter<Trka, TrkaDTO> {
//
//	@Override
//	public TrkaDTO convert(Trka source) {
//		TrkaDTO dto = new TrkaDTO();
//		dto.setId(source.getId());
//		dto.setDuzinaStaze(source.getDuzinaStaze());
//		dto.setKategorija(source.getKategorija());
////		dto.setIBU(source.getIBU());
////		dto.setProcenat_alkohola(source.getProcenat_alkohola());
////		dto.setKolicina(source.getKolicina());
//		dto.setManifestacijaId(source.getManifestacija().getId());
//		dto.setManifestacijaNaziv(source.getManifestacija().getNaziv());
//		// dto.setVrstaPivaId(source.getVrstaPiva().getId());
//		// dto.setVrstaPivaNaziv(source.getVrstaPiva().getNaziv());
//
//		return dto;
//	}
//
//	public List<TrkaDTO> convert(List<Trka> trke) {
//		List<TrkaDTO> ret = new ArrayList<>();
//
//		for (Trka k : trke) {
//			ret.add(convert(k));
//		}
//
//		return ret;
//	}
//
//}

@Component
public class TrkaTOTrkaDTO implements Converter<Trka, TrkaDTO> {

	@Override
<<<<<<< HEAD
	public TrkaDTO convert(Trka source) {
		TrkaDTO dto = new TrkaDTO();
		dto.setId(source.getId());
		dto.setDuzinaStaze(source.getDuzinaStaze());
		dto.setKategorija(source.getKategorija());
		dto.setManifestacijaId(source.getManifestacija().getId());
		dto.setManifestacijaNaziv(source.getManifestacija().getNaziv());
//		dto.setIBU(source.getIBU());
//		dto.setProcenat_alkohola(source.getProcenat_alkohola());
//		dto.setKolicina(source.getKolicina());
		
		// dto.setVrstaPivaId(source.getVrstaPiva().getId());
		// dto.setVrstaPivaNaziv(source.getVrstaPiva().getNaziv());

		return dto;
=======
	public TrkaDTO convert(Trka trka) {
		TrkaDTO trkaDTO = new TrkaDTO();
		trkaDTO.setId(trka.getId());
//		takmicenjaGodinaDTO.setNaziv(takmicenjaGodina.getNaziv());
//		takmicenjaGodinaDTO.setPIB(takmicenjaGodina.getPIB());
//		takmicenjaGodinaDTO.setDrzava(takmicenjaGodina.getDrzava());
		return trkaDTO;
>>>>>>> 154e6114b3aa5b144d1238ec3d3ea5d02f4c8ed5
	}

	public List<TrkaDTO> convert(List<Trka> trke) {
		List<TrkaDTO> ret = new ArrayList<>();

		for (Trka i : trke) {
			ret.add(convert(i));
		}

		return ret;
	}

}