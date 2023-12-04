/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class GetParametroConfigurazioneEnteResponse extends ServiceResponse {

	private String valoreParametro;

	public String getValoreParametro() {
		return valoreParametro;
	}

	public void setValoreParametro(String valoreParametro) {
		this.valoreParametro = valoreParametro;
	}
}
