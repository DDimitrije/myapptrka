package jwd.knjizara.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jwd.knjizara.model.Trkac;
import jwd.knjizara.model.Trka;
import jwd.knjizara.service.TrkacService;
import jwd.knjizara.service.TrkaService;
import jwd.knjizara.support.TrkacTOTrkacDTO;
import jwd.knjizara.support.TrkaTOTrkaDTO;
import jwd.knjizara.web.dto.TrkacDTO;
import jwd.knjizara.web.dto.TrkaDTO;

@RestController
@RequestMapping(value = "/api/trka")
public class ApiTrkaController {// pivarai
	@Autowired
	private TrkaService trkaService;
	@Autowired
	private TrkacService trkacService;
	@Autowired
	private TrkaTOTrkaDTO toDTO;
	@Autowired
	private TrkacTOTrkacDTO toTrkacDTO;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TrkaDTO>> get() {
		return new ResponseEntity<>(toDTO.convert(trkaService.findAll()), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<TrkaDTO> get(@PathVariable Long id) {

		Trka trka = trkaService.findOne(id);

		if (trka == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(trka), HttpStatus.OK);
	}

	@RequestMapping(value = "/{trkaId}/trkaci")
	public ResponseEntity<List<TrkacDTO>> trkacTrka(@PathVariable Long trkaId,
			@RequestParam(defaultValue = "0") int pageNum) {
		Page<Trkac> trkac = trkacService.findByTrkaId(pageNum, trkaId);

		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(trkac.getTotalPages()));
		return new ResponseEntity<>(toTrkacDTO.convert(trkac.getContent()), headers, HttpStatus.OK);
	}
}
