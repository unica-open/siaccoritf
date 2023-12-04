/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siaccommon.util.CoreUtil;


/**
 * TipologiaGestione: enum che raccoglie i codici delle tipologie di gestione livelli
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = CORDataDictionary.NAMESPACE)

// TODO: spostare gestione in ParametroConfigurazioneEnteEnum e relativa tabella (siac_t_parametro_config_ente)
/**
 * @deprecated
 * This method is no longer used.
 * <p> See {@link it.csi.siac.siaccorser.model.ParametroConfigurazioneEnteEnum}.
 */	
@Deprecated
public enum ParametroConfigurazioneEnte {

	FEL_TELEFONO_TRASMITTENTE("FEL-NUM"),
	FEL_MAIL_TRASMITTENTE("FEL-MAIL"),
	FEL_CODICE_AMMINISTRAZIONE_DESTINATARIA("FEL-DEST"),
		
	;
	
	private String codice;

	private static final Map<String, ParametroConfigurazioneEnte> REVERSE_MAP = CoreUtil
			.getEnumMap(ParametroConfigurazioneEnte.class);

	ParametroConfigurazioneEnte(String codice) {
		this.codice = codice;
	}

	public String getCodice() {
		return codice;
	}

	/**
	 * Attenzione: il fromCodice non ritorna la referenza di TipologiaGestioneLivelli 
	 * per codice uguale a GEST_BIL, xchè la mappa costruita dal CoreUtil.getEnumMap
	 * è costituita da Key= nome elemento enum (es. GESTIONE_LIVELLO_BILANCIO) e Value= Istanza tipologia gestione livello
	 * (corrispondente quindi per l'esempio della key sopra citata è GESTIONE_LIVELLO_BILANCIO)
	 * @param codice
	 * @return
	 */
	public static ParametroConfigurazioneEnte fromCodice(String codice) {
		if(StringUtils.isBlank(codice)) {
			return null;
		}
		for (ParametroConfigurazioneEnte e : ParametroConfigurazioneEnte.values()) {
			if (e.getCodice().equals(codice)) {
				return e;
			}
		}
		throw new IllegalArgumentException("Il codice " + codice
				+ " non ha un mapping corrispondente in ParametroConfigurazioneEnte");
	}
	
	public static List<String> getAllCodes() {
		List<String> codes = new ArrayList<String>();
		for (ParametroConfigurazioneEnte p : values()) {
			codes.add(p.getCodice());
		}
		return codes;
	}
	
}
