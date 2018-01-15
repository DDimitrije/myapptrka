package jwd.knjizara.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.knjizara.model.Trka;
import jwd.knjizara.web.dto.TrkaDTO;

@Component
public class TrkaTOTrkaDTO implements Converter<Trka, TrkaDTO> {

	@Override
	public TrkaDTO convert(Trka source) {
		TrkaDTO dto = new TrkaDTO();
		dto.setId(source.getId());
		dto.setDuzinaStaze(source.getDuzinaStaze());
		dto.setKategorija(source.getKategorija());
//		dto.setIBU(source.getIBU());
//		dto.setProcenat_alkohola(source.getProcenat_alkohola());
//		dto.setKolicina(source.getKolicina());
		dto.setManifestacijaId(source.getManifestacija().getId());
		dto.setManifestacijaNaziv(source.getManifestacija().getNaziv());
		// dto.setVrstaPivaId(source.getVrstaPiva().getId());
		// dto.setVrstaPivaNaziv(source.getVrstaPiva().getNaziv());

		return dto;
	}

	public List<TrkaDTO> convert(List<Trka> trke) {
		List<TrkaDTO> ret = new ArrayList<>();

		for (Trka k : trke) {
			ret.add(convert(k));
		}

		return ret;
	}

}
