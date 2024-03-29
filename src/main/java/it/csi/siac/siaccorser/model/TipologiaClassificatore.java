/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.CoreUtil;


/**
 * TipologiaClassificatore: enum che raccoglie i codici delle tipologie di classificatori 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = CORDataDictionary.NAMESPACE)
public enum TipologiaClassificatore {
	MISSIONE, PROGRAMMA, TITOLO_SPESA, TITOLO_ENTRATA, MACROAGGREGATO,
	CLASSIFICAZIONE_COFOG, DIVISIONE_COFOG, GRUPPO_COFOG, CLASSE_COFOG, 
	TIPOLOGIA, CATEGORIA, TIPO_FINANZIAMENTO, TIPO_FONDO, CDC, CDR, PDC, TPV,
	PDC_V, PDC_IV, PDC_III, PDC_II, PDC_I, CLASSIFICATORE_1, CLASSIFICATORE_2,
	CLASSIFICATORE_3, CLASSIFICATORE_4, CLASSIFICATORE_5, CLASSIFICATORE_6, 
	CLASSIFICATORE_7, CLASSIFICATORE_8, CLASSIFICATORE_9, CLASSIFICATORE_10,
	TIPO_AMBITO,TIPO_IMPRESA, TIPO_AVVISO,
	//SIAC-7192
	RISORSA_ACCANTONATA,
	
	/**
	 * 26/11/2013 Aggiunti i nuovi classificatori di fin
	 */
	TIPO_AFFIDAMENTO, MOTIVO_MODIFICA_ENTRATA, MOTIVO_MODIFICA_SPESA, TIPO_IMPEGNO,
	PCE,PCE_I,PCE_II,PCE_III,PCE_IV,PCE_V, BOLLO,DISTINTA, ATTIVITA_IVA, ALIQUOTA_IVA,
	CONTO_TESORERIA, CONTO_CORRENTE, TIPO_REGISTRAZIONE_IVA, AGENZIA, BANCA, TIPO_DOCUMENTO,
	CAUSALE_ENTRATA,CAUSALE_PRE_DOCUMENTO_SPESA,CAUSALE_PRE_DOCUMENTO,
	//classif generici per l'Impegno
	CLASSIFICATORE_11, CLASSIFICATORE_12,
	CLASSIFICATORE_13, CLASSIFICATORE_14, CLASSIFICATORE_15,  
	
	//classif generici per l'Accertamento
	CLASSIFICATORE_16, CLASSIFICATORE_17,
	CLASSIFICATORE_18, CLASSIFICATORE_19, CLASSIFICATORE_20,  
	
	
	/**
	 * 12/05/2014 Aggiunti nuovi classificatori fin per gli ordinativi
	 */
	// per gli ordinativi di pagamento
	CLASSIFICATORE_21, CLASSIFICATORE_22,
	CLASSIFICATORE_23, CLASSIFICATORE_24, CLASSIFICATORE_25,  
	
	// per gli ordinativi di incasso
	CLASSIFICATORE_26, CLASSIFICATORE_27,
	CLASSIFICATORE_28, CLASSIFICATORE_29, CLASSIFICATORE_30,  
	
	// Aggiunti
	RICORRENTE_ENTRATA, RICORRENTE_SPESA, PERIMETRO_SANITARIO_ENTRATA, PERIMETRO_SANITARIO_SPESA,
	SIOPE_ENTRATA, SIOPE_SPESA, TRANSAZIONE_UE_ENTRATA, TRANSAZIONE_UE_SPESA,
	POLITICHE_REGIONALI_UNITARIE, SIOPE_ENTRATA_I, SIOPE_ENTRATA_II, SIOPE_ENTRATA_III,
	SIOPE_SPESA_I, SIOPE_SPESA_II, SIOPE_SPESA_III,
	
	CLASSIFICATORE_31, CLASSIFICATORE_32, CLASSIFICATORE_33, CLASSIFICATORE_34, CLASSIFICATORE_35,
	CLASSIFICATORE_36, CLASSIFICATORE_37, CLASSIFICATORE_38, CLASSIFICATORE_39, CLASSIFICATORE_40,
	CLASSIFICATORE_41, CLASSIFICATORE_42, CLASSIFICATORE_43, CLASSIFICATORE_44, CLASSIFICATORE_45,
	CLASSIFICATORE_46, CLASSIFICATORE_47, CLASSIFICATORE_48, CLASSIFICATORE_49, CLASSIFICATORE_50, 
	CLASSIFICATORE_51, CLASSIFICATORE_52, CLASSIFICATORE_53 ,
	
	
	// per causaleEP
	VALORE_BENE, MODALITA_AQUISIZIONE_BENE, TIPO_DOCUMENTO_COLLEGATO, TIPO_ONERE_FISCALE, RILEVANTE_IVA,
	CONTO_CORRENTE_PREDISPOSIZIONE_INCASSO,
	//SIAC-6206
	CLASSIFICATORE_STIPENDI
	

	;
	
	private static final Map<String, TipologiaClassificatore> REVERSE_MAP = CoreUtil
			.getEnumMap(TipologiaClassificatore.class);


	public static TipologiaClassificatore fromCodice(String codice) {
		return REVERSE_MAP.get(codice);
	}

}
