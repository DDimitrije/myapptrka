package jwd.knjizara.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class TakmicenjaGodina {
	@Id
	@GeneratedValue
	@Column
	private Long id;
//	@Column
//	private String naziv;
//	@Column
//	private Date datum;
	
//	@OneToMany(mappedBy="takmicenjagodina",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	private List<Trka> trke = new ArrayList<>();
	
	@OneToMany(mappedBy="takmicenjagodina",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Manifestacija> manifestacije = new ArrayList<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Manifestacija> getManifestacije() {
		return manifestacije;
	}
	public void setManifestacije(List<Manifestacija> manifestacije) {
		this.manifestacije = manifestacije;
	}
	public void addManifestacija(Manifestacija manifestacija){
		this.manifestacije.add(manifestacija);
		if(!this.equals(manifestacija.getTakmicenjaGodina())){
			manifestacija.setTakmicenjaGodina(this);
		}
	}
	
	
	
//	public List<Trka> getTrke() {
//		return trke;
//	}
//	public void setTrke(List<Trka> trke) {
//		this.trke = trke;
//	}
//	public void addTrka(Trka trka){
//		this.trke.add(trka);
//		if(!this.equals(trka.getTakmicenjaGodina())){
//			trka.setTakmicenjaGodina(this);
//		}
//	}

}
