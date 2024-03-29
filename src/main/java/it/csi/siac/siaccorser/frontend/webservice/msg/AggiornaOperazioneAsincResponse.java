/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Messaggio di risposta alla richiesta di aggiornamento dell'ooperazione asincrona
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class AggiornaOperazioneAsincResponse extends ServiceResponse {
	// Nulla da aggiungere
}
