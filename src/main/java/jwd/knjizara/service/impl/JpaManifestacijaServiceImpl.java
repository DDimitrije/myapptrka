package jwd.knjizara.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jwd.knjizara.model.Manifestacija;
import jwd.knjizara.repository.ManifestacijaRepository;
import jwd.knjizara.service.ManifestacijaService;
//import jwd.knjizara.service.PrevoznikService;

	@Service
	@Transactional
	public class JpaManifestacijaServiceImpl implements ManifestacijaService {
		@Autowired
		private ManifestacijaRepository manifestacijaRepository;

		@Override
		public List<Manifestacija> findAll() {
			return manifestacijaRepository.findAll();
		}

		@Override
		public Manifestacija findOne(Long id) {
			return manifestacijaRepository.findOne(id);
		}

		@Override
		public void save(Manifestacija manifestacija) {
			manifestacijaRepository.save(manifestacija);
		}

		@Override
		public void remove(Long id) {
			manifestacijaRepository.delete(id);
		}
}
