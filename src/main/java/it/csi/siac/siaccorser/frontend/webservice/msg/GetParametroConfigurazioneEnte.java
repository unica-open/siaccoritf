/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class GetParametroConfigurazioneEnte extends ServiceRequest {
	private String nomeParametro;

	public String getNomeParametro() {
		return nomeParametro;
	}

	public void setNomeParametro(String nomeParametro) {
		this.nomeParametro = nomeParametro;
	}

}
