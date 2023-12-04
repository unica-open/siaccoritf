/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg.file;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.file.TipoFile;

@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class RicercaTipoFileResponse extends ServiceResponse {
	private TipoFile tipoFile;

	public TipoFile getTipoFile() {
		return tipoFile;
	}

	public void setTipoFile(TipoFile tipoFile) {
		this.tipoFile = tipoFile;
	}
}
