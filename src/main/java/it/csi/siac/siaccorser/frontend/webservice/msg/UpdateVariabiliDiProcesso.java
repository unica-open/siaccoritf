/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.AzioneRichiesta;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.errore.ErroreCore;


/**
 * Messaggio di richiesta di variazione delle variabili di processo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class UpdateVariabiliDiProcesso extends ServiceRequest {
	
	AzioneRichiesta azioneRichiesta;

	@Override
	public List<Errore> valida() {
		List<Errore> errori = new ArrayList<Errore>();
		
		if (azioneRichiesta==null)
			errori.add(ErroreCore.DATO_OBBLIGATORIO_OMESSO.getErrore("azioneRichiesta"));
		
		return errori;	
	}
	
	/**
	 * @return the azioneRichiesta
	 */
	public AzioneRichiesta getAzioneRichiesta() {
		return azioneRichiesta;
	}

	/**
	 * @param azioneRichiesta
	 *            the azioneRichiesta to set
	 */
	public void setAzioneRichiesta(AzioneRichiesta azioneRichiesta) {
		this.azioneRichiesta = azioneRichiesta;
	}


}
