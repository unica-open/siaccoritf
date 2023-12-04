/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg.attpendenti;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.AzioneConsentita;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * @author Pro Logic
 *
 */
@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class RicercaSinteticaGruppoAttivitaPendentiVariazione extends ServiceRequest {
	
	private AzioneConsentita azioneConsentita;
	private boolean soloTotali;
	private List<Integer> uidSac = new ArrayList<>();
	
	private ParametriPaginazione parametriPaginazione;

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	
	public AzioneConsentita getAzioneConsentita() {
		return azioneConsentita;
	}

	public void setAzioneConsentita(AzioneConsentita azioneConsentita) {
		this.azioneConsentita = azioneConsentita;
	}

	public boolean isSoloTotali() {
		return soloTotali;
	}

	public void setSoloTotali(boolean soloTotali) {
		this.soloTotali = soloTotali;
	}

	public List<Integer> getUidSac() {
		return uidSac;
	}

	public void setUidSac(List<Integer> uidSac) {
		this.uidSac = uidSac;
	}
	
	
	
	
		

}
