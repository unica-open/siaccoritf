/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

public enum TipoClassificatoreEnum {

	CENTRO_DI_CONTROLLO("CDC"), 
	CENTRO_DI_RESPONSABILITA("CDR"),
	;
	
	private String codice;

	TipoClassificatoreEnum(String codice) {
		this.codice = codice;
	}

	public String getCodice() {
		return codice;
	}

	public static TipoClassificatoreEnum byCodice(String codice) {
		for (TipoClassificatoreEnum e : TipoClassificatoreEnum.values()) {
			if (e.getCodice().equals(codice)) {
				return e;
			}
		}
		throw new IllegalArgumentException("Il codice " + codice + " non ha un mapping corrispondente");
	}

}
