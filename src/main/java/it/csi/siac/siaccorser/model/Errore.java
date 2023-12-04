/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.SystemInfo;



@XmlType(namespace = CORDataDictionary.NAMESPACE)
public class Errore extends Entita {

	private static final long serialVersionUID = 5876476288257073816L;

	private String codice;
	private String descrizione;
	private String dettagliTecnici;  

	public void setDettagliTecnici(String dettagliTecnici) {
		this.dettagliTecnici = dettagliTecnici;
	}

	public Errore(){
		super();
	}
	
	public Errore(String codice, String descrizione) {
		this(codice, descrizione, false);
	}
	
	public Errore(String codice, String descrizione, boolean mostraDettagliTecnici) {
		this();
		this.codice = codice;
		this.descrizione = descrizione;
		if (mostraDettagliTecnici) {
			this.initDettagliTecnici();
		}
	}
	
	public boolean hasDettagliTecnici() {
		return dettagliTecnici != null;
	}

	private void initDettagliTecnici() {
		this.dettagliTecnici = String.format(
				"%tF-%tT/%s/%s", 
				new Date(), 
				new Date(), 
				SystemInfo.getJbossServerName(), 
				SystemInfo.getJbossNodeName()
		);
	}

	public String getTesto() {
		return String.format("%s - %s", getCodice(), getDescrizione());
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDettagliTecnici() {
		return dettagliTecnici;
	}

}
