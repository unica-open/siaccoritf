/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.CoreUtil;
import it.csi.siac.siaccommon.util.collections.Function;


@XmlType(namespace = CORDataDictionary.NAMESPACE)
public enum FaseBilancio {
	@Deprecated PLURIENNALE("?", "Pluriennale"),
	PREVISIONE("P", "Previsione"), 
	ESERCIZIO_PROVVISORIO("E", "Esercizio provvisorio"), 
	GESTIONE("G", "Gestione"), 
	ASSESTAMENTO("A", "Assestamento"), 
	PREDISPOSIZIONE_CONSUNTIVO("O", "Predisposizione consuntivo"), 
	CHIUSO("C", "Chiuso");

	private String codice;
	private String descrizione;
	
	FaseBilancio(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	private static final Map<String, FaseBilancio> REVERSE_MAP = 
			CoreUtil.getEnumMap(FaseBilancio.class, new Function<FaseBilancio, String>(){
				@Override
				public String map(FaseBilancio source) {
					return source.getCodice();
				}});
	
	public static FaseBilancio fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}
}
