/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.Map;

import it.csi.siac.siaccommon.util.CoreUtil;
import it.csi.siac.siaccommon.util.collections.Function;

public enum ParametroConfigurazioneEnteEnum {

	OOPP_PROGETTO_DEFAULT_ATTO_AMM_ID("OOPP.progetto.defaultAttoAmm.id"),
	OOPP_PROGETTO_AGGIORNA_DISABILITA_CAMPI("OOPP.progetto.aggiorna.disabilitaCampi"),
	ALLEGATO_ATTO_INVIA_ABILITA_CHECKLIST("allegatoAtto.invia.abilitaChecklist" ),
	IMPEGNO_OBBLIGO_CAPITOLI_PERIMETRO_SANITARIO("impegno.obbligo.perimetroSanitario"),
	TMP_VERIFICA_EVASIONI_SWITCH_TO_CPASS_ENDPOINT("verificaEvasioni.switchTo.CPASS.endpoint"),
	NUMERAZIONE_AUTOMATICA_CAPITOLO("capitolo.inserisci.abilitaNumerazioneAutomatica"), //task-86
	LIMITE_NUMERAZIONE_AUTOMATICA_CAPITOLO("capitolo.inserisci.limiteNumerazioneAutomatica"), //task-86
	PROGETTO_ABILITA_GESTIONE_ESERCIZIO_PROVVISORIO("progetto.abilita.gestione.esercizioProvvisorio"), //SIAC-8900
	INSERISCI_ORDINATIVO_PAGAMENTO_DEFAULT_COMMISSIONI("ordinativo.pagamento.inserisci.default.commissioni"), //task-162
													 

	;
	
	private String nomeParametro;
		
	private static final Map<String, ParametroConfigurazioneEnteEnum> ENUM_BY_NOME_PARAMETRO = 
		CoreUtil.getEnumMap(
			ParametroConfigurazioneEnteEnum.class, 
			new Function<ParametroConfigurazioneEnteEnum, String>() {
	
				@Override
				public String map(ParametroConfigurazioneEnteEnum source) {
					return source.getNomeParametro();
				}
			}
	);

	ParametroConfigurazioneEnteEnum(String nomeParametro){		
		this.nomeParametro = nomeParametro;
	}

	public static ParametroConfigurazioneEnteEnum byNomeParametro(String nomeParametro) {
		ParametroConfigurazioneEnteEnum parametroConfigurazioneEnteEnum = ENUM_BY_NOME_PARAMETRO.get(nomeParametro);

		if (parametroConfigurazioneEnteEnum == null) {
			throw new IllegalArgumentException("Il parametro " + nomeParametro + " non ha un mapping corrispondente in SiacTParametroConfigEnteEnum");
		}
		
		return parametroConfigurazioneEnteEnum;
	}


	public String getNomeParametro() {
		return nomeParametro;
	}


	public void setNomeParametro(String nomeParametro) {
		this.nomeParametro = nomeParametro;
	}
}
