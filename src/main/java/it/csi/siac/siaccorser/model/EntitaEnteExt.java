/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Estende EntitaExt con informazioni legate all'ente, 
 *
 */
@XmlType(namespace = CORDataDictionary.NAMESPACE)
public class EntitaEnteExt extends EntitaExt {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3395435527405505347L;
	
	private Ente ente;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	
}
