/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg.attpendenti;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.AttivitaPendente;
import it.csi.siac.siaccorser.model.AzioneConsentita;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
//
@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class RicercaSinteticaGruppoAttivitaPendentiVariazioneResponse extends ServiceResponse {
	
	private int totali;
	private int urgenti;
	@XmlElementWrapper(name = "listaCausali")
	@XmlElement(name = "causale")
	private ListaPaginata<AttivitaPendente> attivitaPendenti = new ListaPaginataImpl<AttivitaPendente>();
	
	private AzioneConsentita azioneConsentita;
	
	
	public int getTotali() {
		return totali;
	}
	public void setTotali(int totali) {
		this.totali = totali;
	}
	public int getUrgenti() {
		return urgenti;
	}
	public void setUrgenti(int urgenti) {
		this.urgenti = urgenti;
	}
	@XmlTransient
	public ListaPaginata<AttivitaPendente> getAttivitaPendenti() {
		return attivitaPendenti;
	}
	
	public void setAttivitaPendenti(ListaPaginata<AttivitaPendente> attivitaPendenti) {
		this.attivitaPendenti = attivitaPendenti;
	}
	public AzioneConsentita getAzioneConsentita() {
		return azioneConsentita;
	}
	public void setAzioneConsentita(AzioneConsentita azioneConsentita) {
		this.azioneConsentita = azioneConsentita;
	}
//	@Override
//	protected ListaPaginataImpl<AttivitaPendente> getAsListaPaginata() {
//		return (ListaPaginataImpl<AttivitaPendente>) getAttivitaPendenti();
//	}
	
}
