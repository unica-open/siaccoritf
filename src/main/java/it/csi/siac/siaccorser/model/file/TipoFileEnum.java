/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siaccorser.model.file;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.CORDataDictionary;

@XmlType(namespace = CORDataDictionary.NAMESPACE)
public enum TipoFileEnum {
	
	REPORT_XML("REPORT_XML"),
	REPORT_PDF("REPORT_PDF"),
	STIPE("STIPE"),
	CESPITI("CESPITI"),
	ORDINATIVO_SPESA("ORDINATIVO_SPESA"), 
	ORDINATIVO_ENTRATA("ORDINATIVO_ENTRATA"), 
	PREDOCUMENTI_SPESA("PREDOCUMENTI_SPESA"), 
	PREDOCUMENTI_ENTRATA("PREDOCUMENTI_ENTRATA"),
	DOCUMENTO_SPESA("DOCUMENTO_SPESA"), 
	DOCUMENTO_ENTRATA("DOCUMENTO_ENTRATA"), 
	ONERI("ONERI"), 
	STIPE_ONERI("STIPE_ONERI"), 
	FLUSSO_PREDOC_ENTRATE("FLUSSO_PREDOC_ENTRATE"), 
	FLUSSO_PREDOC_SPESE("FLUSSO_PREDOC_SPESE"), 
	FLUSSO_ATTI("FLUSSO_ATTI"), 
	LIMITE_IMPEGNABILE("LIMITE_IMPEGNABILE"), 
	PREVISIONE("PREVISIONE"), 
	FLUSSO_TEFA("FLUSSO_TEFA"), 
	PREVISIONE_IMP_ACC("PREVISIONE-IMP-ACC"), 
	REPORT_XBRL("REPORT_XBRL"),
	;
	
	private String codice;
	
	TipoFileEnum(String codice) {
		this.codice = codice;
	}
	
	public String getCodice() {
		return codice;
	}
}
