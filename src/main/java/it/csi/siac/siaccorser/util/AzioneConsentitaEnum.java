/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.util;

import java.util.Iterator;
import java.util.List;

import it.csi.siac.siaccorser.model.Azione;
import it.csi.siac.siaccorser.model.AzioneConsentita;
import it.csi.siac.siaccorser.model.AzioneRichiesta;

/**
 * Enumeration che contiene una mappatura delle azioni consentite.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 24/09/2013
 *
 */
public enum AzioneConsentitaEnum {
	
	// Capitolo di uscita previsione
	CAPITOLO_USCITA_PREVISIONE_AGGIORNA("OP-GESC028-aggCapUscPrev"),
	CAPITOLO_USCITA_PREVISIONE_ANNULLA("OP-GESC024-annCapUscPrev"),
	CAPITOLO_USCITA_PREVISIONE_ELIMINA("OP-GESS009-elimCapUscPrev"),
	CAPITOLO_USCITA_PREVISIONE_INSERISCI("OP-GESC022-insCapUscPrev"),
	CAPITOLO_USCITA_PREVISIONE_AGGIORNA_DECENTRATO("OP-GESC028-DEC-aggCapUscPrev"),
	
	// Capitolo di uscita gestione
	CAPITOLO_USCITA_GESTIONE_AGGIORNA("OP-GESC035-aggCapUscGest"),
	CAPITOLO_USCITA_GESTIONE_ANNULLA("OP-GESC036-annCapUscGest"),
	CAPITOLO_USCITA_GESTIONE_ELIMINA("OP-GESS010-elimCapUscGest"),
	CAPITOLO_USCITA_GESTIONE_INSERISCI("OP-GESC026-insCapUscGest"),
	
	// Capitolo di entrata previsione
	CAPITOLO_ENTRATA_PREVISIONE_AGGIORNA("OP-GESC027-aggCapEntPrev"),
	CAPITOLO_ENTRATA_PREVISIONE_ANNULLA("OP-GESC037-annCapEntPrev"),
	CAPITOLO_ENTRATA_PREVISIONE_ELIMINA("OP-GESS007-elimCapEntPrev"),
	CAPITOLO_ENTRATA_PREVISIONE_INSERISCI("OP-GESC023-insCapEntPrev"),
	CAPITOLO_ENTRATA_PREVISIONE_AGGIORNA_DECENTRATO("OP-GESC027-DEC-aggCapEntPrev"),
	
	// Capitolo di entrata gestione
	CAPITOLO_ENTRATA_GESTIONE_AGGIORNA("OP-GESC034-aggCapEntGest"),
	CAPITOLO_ENTRATA_GESTIONE_ANNULLA("OP-GESC038-annCapEntGest"),
	CAPITOLO_ENTRATA_GESTIONE_ELIMINA("OP-GESS008-elimCapEntGest"),
	CAPITOLO_ENTRATA_GESTIONE_INSERISCI("OP-GESC025-insCapEntGest"),
	
	// Relazioni Atto di Legge Capitolo
	RELAZIONE_ATTO_CAPITOLO_AGGIORNA("OP-GESC057-gesAttLeg"),
	RELAZIONE_ATTO_CAPITOLO_ANNULLA("OP-GESC057-gesAttLeg"),
	
	// Vincolo
	VINCOLO_CONSULTA("OP-GESC021-consVincolo"),
	VINCOLO_GESTISCI("OP-GESC020-gesVincoli"),
	
	// Progetto
	PROGETTO_CONSULTA("OP-GESC079-ConsulPro"),
	PROGETTO_AGGIORNA("OP-GESC077-AggPro"),
	PROGETTO_AGGIORNA_DECENTRATO("OP-GESC077-AggProDecentrato"),
	CRONO_NEL_PROGETTO_CONSULTA("OP-GESC077-AggPro"),
	CRONO_NEL_PROGETTO_AGGIORNA("OP-GESC077-AggPro"),
	
	// Cronoprogramma
	CRONOPROGRAMMA_INSERISCI("OP-GESC080-InsCronoprog"),
	CRONOPROGRAMMA_AGGIORNA("OP-GESC081-AggCronoprog"),
	CRONOPROGRAMMA_FPV_PROVVISORIO("OP-GESC078-GestFPVProv"),
	
	// Documento
	DOCUMENTO_SPESA_CONSULTA("OP-SPE-ricDocSpe"),
	DOCUMENTO_SPESA_AGGIORNA("OP-SPE-aggDocSpe"),
	DOCUMENTO_SPESA_AGGIORNA_QUIENTANZA("OP-Spe-aggDocSpeQuietanza"),
	DOCUMENTO_SPESA_ANNULLA("OP-SPE-aggDocSpe"),
	DOCUMENTO_SPESA_GESTIONE_ACQUISTI("OP-Spe-gestioneAcquisti"),
	DOCUMENTO_SPESA_DECENTRATO("OP-SPE-gestisciDocDecentrato"),
	DOCUMENTO_SPESA_INSERISCI("OP-SPE-insDocSpe"),
	// SIAC-4749
	DOCUMENTO_SPESA_DATI_FATTURA_PAGATA("OP-SPE-gestisciDatiFatturaPagata"),
	// SIAC-5072
	DOCUMENTO_SPESA_NO_DATI_SOSPENSIONE_DECENTRATO("OP-SPE-NoDatiSospensioneDec"),
	//SIAC-5346
	DOCUMENTO_SPESA_LIMITA_DATI_FEL("OP-SPE-LimitaDatiFELDec"),
	
	DOCUMENTO_ENTRATA_CONSULTA("OP-ENT-ricDocEnt"),
	DOCUMENTO_ENTRATA_AGGIORNA("OP-ENT-aggDocEnt"),
	DOCUMENTO_ENTRATA_AGGIORNA_QUIENTANZA("OP-ENT-aggDocEntQuietanza"),
	DOCUMENTO_ENTRATA_ANNULLA("OP-ENT-aggDocEnt"),
	DOCUMENTO_ENTRATA_DECENTRATO("OP-ENT-gestisciDocDecentrato"),
	DOCUMENTO_ENTRATA_INSERISCI("OP-ENT-insDocEnt"),
	
	PROVVEDIMENTO_SPESA_GESTISCI("OP-SPE-gestProvvedimento"),
	// Gestione IVA
	GESTIONE_IVA("OP-IVA-gestione"),
	
	// PreDocumento
	PREDOCUMENTO_SPESA_INSERISCI("OP-SPE-insPreDoc"),
	PREDOCUMENTO_SPESA_INSERISCI_DECENTRATO("OP-SPE-insPreDocDec"),
	PREDOCUMENTO_ENTRATA_INSERISCI("OP-ENT-insPreDoc"),
	PREDOCUMENTO_ENTRATA_INSERISCI_DECENTRATO("OP-ENT-insPreDocDec"),
	PREDOCUMENTO_SPESA_AGGIORNA("OP-SPE-aggPreDoc"),
	PREDOCUMENTO_SPESA_AGGIORNA_DECENTRATO("OP-SPE-aggPreDocDec"),
	PREDOCUMENTO_ENTRATA_COMPLETA_SENZA_ACCERTAMENTO("OP-ENT-completaPreDocSenzaAcc"),
	PREDOCUMENTO_ENTRATA_AGGIORNA("OP-ENT-aggPreDoc"),
	PREDOCUMENTO_ENTRATA_AGGIORNA_DECENTRATO("OP-ENT-aggPreDocDec"),
	PREDOCUMENTO_SPESA_CONSULTA("OP-SPE-consPreDoc"),
	PREDOCUMENTO_ENTRATA_CONSULTA("OP-ENT-consPreDoc"),
	PREDOCUMENTO_SPESA_RICERCA("OP-SPE-ricPreDoc"),
	PREDOCUMENTO_ENTRATA_RICERCA("OP-ENT-ricPreDoc"),
	// SIAC-5041
	PREDOCUMENTO_ENTRATA_MODIFICA_ACC_NON_AMMESSA("OP-ENT-PreDocNoModAcc"),
	// SIAC-4996
	PREDOCUMENTO_SPESA_DEFINISCI_ELENCO("OP-SPE-CompDefPreDoc"),
	
	// Causale
	CAUSALE_SPESA_CONSULTA("OP-SPE-ricCausaliPreDoc"),
	CAUSALE_SPESA_GESTISCI("OP-SPE-gestisciCausaliPreDoc"),
	CAUSALE_ENTRATA_CONSULTA("OP-ENT-ricCausaliPreDoc"),
	CAUSALE_ENTRATA_GESTISCI("OP-ENT-gestisciCausaliPreDoc"),
	
	// GruppoAttivitaIva
	GRUPPO_ATTIVITA_IVA_CONSULTA("OP-IVA-ricGruppoIva"),
	GRUPPO_ATTIVITA_IVA_AGGIORNA("OP-IVA-aggGruppoIva"),
	GRUPPO_ATTIVITA_IVA_ELIMINA("OP-IVA-aggGruppoIva"),
	
	// RegistroIva
	REGISTRO_IVA_CONSULTA("OP-IVA-ricRegistroIva"),
	REGISTRO_IVA_AGGIORNA("OP-IVA-aggRegistroIva"),
	REGISTRO_IVA_ELIMINA("OP-IVA-aggRegistroIva"),
	// CR-3791
	REGISTRO_IVA_AGGIORNA_BACKOFFICE("OP-IVA-aggRegistroIvaBackOffice"),
	
	// Documento IVA
	DOCUMENTO_IVA_SPESA_AGGIORNA("OP-IVA-aggDocIvaSpe"),
	DOCUMENTO_IVA_SPESA_CONSULTA("OP-IVA-ricDocIvaSpe"),
	DOCUMENTO_IVA_ENTRATA_AGGIORNA("OP-IVA-aggDocIvaEnt"),
	DOCUMENTO_IVA_ENTRATA_CONSULTA("OP-IVA-ricDocIvaEnt"),
	DOCUMENTO_IVA_AGGIORNA_SPESA_BACKOFFICE("OP-IVA-aggDocIvaSpeBackOffice"),
	DOCUMENTO_IVA_AGGIORNA_ENTRATA_BACKOFFICE("OP-IVA-aggDocIvaEntBackOffice"),
	
	// Allegato Atto
	ALLEGATO_ATTO_ANNULLA("OP-COM-aggAttoAllegatoDec"),
	ALLEGATO_ATTO_AGGIORNA_CENTRALE("OP-COM-aggAttoAllegatoCen"),
	ALLEGATO_ATTO_AGGIORNA_DECENTRATO("OP-COM-aggAttoAllegatoDec"),
	ALLEGATO_ATTO_COMPLETA("OP-COM-aggAttoAllegatoDec"),
	ALLEGATO_ATTO_COMPLETA_SENZA_CONTROLLI("OP-COM-complAttoAllegatoNoContr"),
	ALLEGATO_ATTO_CONVALIDA_QUIETANZA("OP-COM-convDetQuietanza"),
	ALLEGATO_ATTO_INVIA("OP-COM-inviaAttoAllegato"),
	ALLEGATO_ATTO_RICERCA("OP-COM-ricAttoAllegato"),
	ALLEGATO_ATTO_INSERISCI_DECENTRATO("OP-COM-insAttoAllegatoDec"),
	ALLEGATO_ATTO_INSERISCI_CENTRALE("OP-COM-insAttoAllegatoCen"),
	// CR-4440
	ALLEGATO_ATTO_INSERISCI_NO_RESIDUI("OP-COM-insAllegatoAttoNoRes"),
	// SIAC-5170
	ALLEGATO_ATTO_CONVALIDA("OP-COM-convDet"),
	// SIAC-5584
	ALLEGATO_ATTO_CONVALIDA_MULTIPLO("OP-COM-ConvMultAttoAllegato"),
	// SIAC-5584
	ALLEGATO_ATTO_COMPLETA_MULTIPLO("OP-COM-ComplMultAttoAllegato"),
	// SIAC-6433
	ALLEGATO_ATTO_STAMPA("OP-COM-StampaAttoAllegato"),
	
	// Tipo Onere
	TIPO_ONERE_AGGIORNA("OP-COM-gestisciCausaliOnere"),
	TIPO_ONERE_CONSULTA("OP-COM-ricCausaliOnere"),
	
	// Cassa Economale
	CASSA_ECONOMALE_GESTIONE_CASSA_ECONOMALE("OP-CEC-gesCassaEco"),
	// TODO
	CASSA_ECONOMALE_MOVIMENTI_CASSA_ECONOMALE("OP-CEC-null"),
	CASSA_ECONOMALE_GESTIONE_OPERAZIONI_CASSA("OP-CEC-gesOpeCasEco"),
	// TODO
	CASSA_ECONOMALE_GESTIONE_LIQUIDAZIONI("OP-CEC-null"),
	CASSA_ECONOMALE_GESTIONE_TABELLA_TIPI_GIUSTIFICATIVI("OP-CEC-gesTabGiustEco"),
	CASSA_ECONOMALE_GESTIONE_TABELLA_OPERAZIONI_CASSA("OP-CEC-gesTabTipOpeCasEco"),

	// Richieste cassa
	// SIAC-5623: aggiunte azioni
	CASSA_ECONOMALE_RIMBORSO_SPESE_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_RIMBORSO_SPESE_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_RIMBORSO_SPESE_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_RIMBORSO_SPESE_ABILITA("OP-CEC-abilitaRimborsoSpese"),
	
	CASSA_ECONOMALE_PAGAMENTO_FATTURE_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_PAGAMENTO_FATTURE_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_PAGAMENTO_FATTURE_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_PAGAMENTO_FATTURE_ABILITA("OP-CEC-abilitaPagamentoFatture"),
	
	CASSA_ECONOMALE_ANTICIPO_SPESE_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_INSERISCI_RENDICONTO("OP-CEC-insRend"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_AGGIORNA_RENDICONTO("OP-CEC-aggRend"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_CONSULTA_RENDICONTO("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_ABILITA("OP-CEC-abilitaAnticipoSpese"),
	
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_INSERISCI_RENDICONTO("OP-CEC-insRend"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_AGGIORNA_RENDICONTO("OP-CEC-aggRend"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_CONSULTA_RENDICONTO("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_PER_TRASFERTA_DIPENDENTI_ABILITA("OP-CEC-abilitaAnticipoPerTrasfertaDipendenti"),
	
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_INSERISCI_RENDICONTO("OP-CEC-insRend"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_AGGIORNA_RENDICONTO("OP-CEC-aggRend"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_CONSULTA_RENDICONTO("OP-CEC-ricRich"),
	CASSA_ECONOMALE_ANTICIPO_SPESE_PER_MISSIONE_ABILITA("OP-CEC-abilitaAnticipoSpesePerMissione"),
	
	CASSA_ECONOMALE_PAGAMENTO_INSERISCI("OP-CEC-insRich"),
	CASSA_ECONOMALE_PAGAMENTO_RICERCA("OP-CEC-ricRich"),
	CASSA_ECONOMALE_PAGAMENTO_AGGIORNA("OP-CEC-aggRich"),
	CASSA_ECONOMALE_PAGAMENTO_ABILITA("OP-CEC-abilitaPagamento"),
	
	// Stampa Cassa economale
	CASSA_ECONOMALE_STAMPA_RICEVUTA("OP-CEC-Stampe"),
	
	// Piano dei conti
	PIANO_DEI_CONTI_RICERCA_PIANO_DEI_CONTI_FIN("OP-GEN-ricPConti"),
	PIANO_DEI_CONTI_GESTISCI_PIANO_DEI_CONTI_FIN("OP-GEN-gestisciPConti"),
	
	// Causale EP
	CAUSALEEP_GEN_GESTIONE("OP-GEN-gestisciCausaleEP"),
	CAUSALEEP_GEN_RICERCA("OP-GEN-ricCausaleEP"),
	CAUSALEEP_GSA_GESTIONE("OP-GEN-gestisciCausaleEPGSA"),
	CAUSALEEP_GSA_RICERCA("OP-GEN-ricCausaleEPGSA"),
	
	// Prima nota libera
	PRIMANOTALIBERA_GEN_GESTIONE("OP-GEN-gestisciPRNotaLibera"),
	PRIMANOTALIBERA_GEN_VALIDA("OP-GEN-validaPRNotaLibera"),
	PRIMANOTALIBERA_GEN_RICERCA("OP-GEN-ricPRNotaLibera"),
	
	PRIMANOTALIBERA_INV_GESTIONE("OP-INV-gestisciRegistroB"),
	PRIMANOTALIBERA_INV_VALIDA("OP-INV-validaRegistroB"),
	PRIMANOTALIBERA_INV_RICERCA("OP-INV-ricRegistroB"),
	
	// Prima nota integrata
	PRIMA_NOTA_INTEGRATA_GESTISCI_GEN("OP-GEN-gestisciPRNotaIntegrata"),
	PRIMA_NOTA_INTEGRATA_RICERCA_GEN("OP-GEN-ricPRNotaIntegrata"),
	PRIMA_NOTA_INTEGRATA_VALIDA_GEN("OP-GEN-validaPRNotaIntegrata"),
	PRIMA_NOTA_INTEGRATA_VALIDA_CRU_GEN("OP-GEN-validaMassPRNotaIntegrata"),
	// SIAC-4524
	PRIMA_NOTA_INTEGRATA_AGGIORNA_GEN("OP-GEN-aggiornaPRNotaIntegrata"),
	
	// Registrazione movimento
	REGISTRAZIONE_MOV_FIN_GESTISCI_GEN("OP-GEN-gestisciRegistro"),
	REGISTRAZIONE_MOV_FIN_RICERCA_GEN("OP-GEN-ricRegistro"),
	
	// Fattura elettronica
	FATTURA_ELETTRONICA_RICERCA("OP-SPE-ricFEL"),
	FATTURA_ELETTRONICA_GESTISCI("OP-SPE-gestisciFEL"),
	
	// Prima nota libera GSA
	// Prima nota libera
	PRIMANOTALIBERA_GSA_GESTIONE("OP-GEN-gestisciPRNotaLiberaGSA"),
	PRIMANOTALIBERA_GSA_VALIDA("OP-GEN-validaPRNotaLiberaGSA"),
	PRIMANOTALIBERA_GSA_RICERCA("OP-GEN-ricPRNotaLiberaGSA"),
	
	// Prima nota integrata GSA
	PRIMA_NOTA_INTEGRATA_GESTISCI_GSA("OP-GEN-gestisciPRNotaIntegrataGSA"),
	PRIMA_NOTA_INTEGRATA_RICERCA_GSA("OP-GEN-ricPRNotaIntegrataGSA"),
	PRIMA_NOTA_INTEGRATA_VALIDA_GSA("OP-GEN-validaPRNotaIntegrataGSA"),
	// SIAC-4524
	PRIMA_NOTA_INTEGRATA_AGGIORNA_GSA("OP-GEN-aggiornaPRNotaIntegrataGSA"),
	
	
	// Registrazione movimento
	REGISTRAZIONE_MOV_FIN_GESTISCI_GSA("OP-GEN-gestisciRegistroRegGSA"),
	REGISTRAZIONE_MOV_FIN_RICERCA_GSA("OP-GEN-ricRegistroRegGSA"),
	PIANO_DEI_CONTI_AGGIORNA_SU_REGISTRO("OP-GEN-aggiornaPdCsuRegistro"),
	
	// Piano dei conti GSA
	PIANO_DEI_CONTI_RICERCA_PIANO_DEI_CONTI_GSA("OP-GEN-ricPContiGSA"),
	PIANO_DEI_CONTI_GESTISCI_PIANO_DEI_CONTI_GSA("OP-GEN-gestisciPContiGSA"),
	
	// Provvisori di cassa
	PROVVISORIO_DI_CASSA_GESTISCI("OP-OIL-GestProvvisorioCassa"),
	
	// Ratei e risconti
	RATEI_RISCONTI("OP-GEN-ratei-risconti"),
	RATEI_RISCONTI_GSA("OP-GEN-ratei-riscontiGSA"),
	
	// SIAC-5481
	REPORTISTICA_PREVISIONE("OP-GESREP2-BilPrev-2017"),
	
	// SIAC-5334
	PRIMA_NOTA_INTEGRATA_MANUALE_GESTIONE_GSA("OP-GEN-gestisciPRNotaIntManGSA"),
	PRIMA_NOTA_INTEGRATA_MANUALE_RICERCA_GSA("OP-GEN-ricPRNotaIntManGSA"),
	
	// CESPITI
	CATEGORIA_CESPITI_AGGIORNA("OP-INV-gestisciCategCespiti"),
	
	// TIPO BENE
	TIPO_BENE_CESPITE_AGGIORNA("OP-INV-gestisciTipoBene"),
	
	// VARIAZIONE CESPITE
	VARIAZIONE_CESPITI_AGGIORNA("OP-INV-gestisciVarCespite"),
	VARIAZIONE_CESPITI_ELIMINA("OP-INV-gestisciVarCespite"),
	
	// DISMISSIONI
	DISMISSIONE_CESPITE_AGGIORNA("OP-INV-gestisciDisCespite"),
	// AMMORTAMENTO
	AMMORTAMENTO_MASSIVO_INSERISCI("OP-INV-gestisciAmmMassivo"),
	// REGISTRO A
	REGISTRO_A_CESPITE_GESTIONE("OP-INV-gestisciRegistroA"),
	REGISTRO_A_CESPITE_RICERCA("OP-INV-ricRegistroA"),
	
	//SIAC-6881
	COMPONENTE_CAPITOLO_AGGIORNA("OP-CIC-componenteCapitolo"),
	
	//SIAC-6884 - GM da modificare perchè l'azione deve essere insVarDecentrata
	INSERISCI_VARIAZIONE_DECENTRATA("OP-GESC001-insVarDecentrato"),
	AGGIORNA_VARIAZIONE("OP-GESC002-aggVar"),
	DEFINISCI_VARIAZIONE("OP-GESC003-defVar"),
	//SIAC-8771
	RICERCA_VARIAZIONI_LIMITATA("OP-GESC004-ricVarLimitaAVariazioniDefDec"),
	//SIAC-6997-BloccoROR
	BLOCCO_SU_INCASSI_RESIDUI("OP-COM-insAllegatoAttoNoResAcc"),
	LIMITA_COMP_VAR_DEC("OP-GESC007-limitaCompVarDec"),
	BLOCCO_SU_LIQ_IMP_RESIDUI("OP-COM-insAllegatoAttoNoResImp")	,
	
	//SIAC-7557
	TIPO_DOCUMENTO_RICERCA("OP-COM-visTipoDocumento"),
	TIPO_DOCUMENTO_AGGIORNA("OP-COM-gestTipoDocumento"),
	TIPO_DOCUMENTO_ELIMINA("OP-COM-gestTipoDocumento"),
	
	// SIAC-7897
	AGGIORNA_PROVVEDIMENTO_SISTEMA_ESTERNO("OP-BKOF019-aggiornaProvvedimentoSistemaEsterno"),
	
	// siacboapp
	ASSOCIA_PROVVISORI_CASSA("OP-OIL-associaProvisoriCassa"),

	
	
	// siacfinapp
	 OP_ATTGESC001_inserisciProvvedimento("OP-ATTGESC001-insProv"), 
		
	 OP_SPE_gestisciImpegnoSDF("OP-SPE-gestisciImpegnoSDF"),
	
	
	 OP_SOG_inserisciSoggDec("OP-SOG-inserisciSoggDec"), 
	 OP_SOG_gestisciSogg("OP-SOG-gestisciSogg"),
	 OP_SOG_gestisciSoggDec("OP-SOG-gestisciSoggDec"),
	 OP_SOG_leggiSoggDec("OP-SOG-leggiSoggDec"),
	 OP_SOG_validaSogg("OP-SOG-validaSogg"),
	 
	 //task-224
	 OP_CEC_SOG_gestisciSogg("OP-CEC-SOG-gestisciSogg"),
	 OP_CEC_SOG_leggiSogg("OP-CEC-SOG-leggiSogg"),
	
	
	 OP_SPE_gestisciImpegno("OP-SPE-gestisciImpegno"),
	 OP_SPE_gestisciImpegnoDecentrato("OP-SPE-gestisciImpegnoDecentrato"),
	 OP_SPE_gestisciImpegnoDecentratoP("OP-SPE-gestisciImpegnoDecentratoP"),
	
	
	 OP_COM_bloccaCTE_Acc("OP-COM-bloccaCTE-Acc"), 
	 OP_COM_bloccaCTE_Imp("OP-COM-bloccaCTE-Imp"), 
	
	
	 OP_SPE_GestisciModifica("OP-SPE-GestisciModifica"),
	 OP_SPE_gestisciImpegnoRIACC("OP-SPE-gestisciImpegnoRIACC"),
	 OP_SPE_gestisciImpegnoPluriennale("OP-SPE-gestisciImpegnoPluriennale"),
	 OP_SPE_aggiornaImpegnoGSA("OP-SPE-aggiornaImpegnoGsa"),
	 OP_SPE_gestImprROR("OP-SPE-gestImprROR"),
	 OP_ENT_gestAccROR("OP-ENT-gestAccROR"),
	
	
	
	 OP_SPE_gestisciParere("OP-SPE-gestisciParere"),
	
	
	 OP_ENT_gestisciAccertamento("OP-ENT-gestisciAccertamento"),
	 OP_ENT_gestisciAccertamentoDecentrato("OP-ENT-gestisciAccertamentoDecentrato"),
	 OP_ENT_gestisciAccertamentoDecentratoP("OP-ENT-gestisciAccertamentoDecentratoP"),
	
	 OP_ENT_GestisciModifica("OP-ENT-GestisciModifica"),
	 OP_ENT_gestisciAccertamentoRIACC("OP-ENT-gestisciAccertamentoRIACC"),
	 OP_ENT_gestisciAccertamentoPluriennale("OP-ENT-gestisciAccertamentoPluriennale"),
	 OP_ENT_aggiornaAccertamentoGSA("OP-ENT-aggiornaAccertamentoGsa"),
	
	 OP_SPE_gestImpRORdecentrato("OP-SPE-gestImpRORdecentrato"),
	 OP_ENT_gestAccRORdecentrato("OP-ENT-gestAccRORdecentrato"),
	
	
	 OP_MUT_gestisciMutuo("OP-MUT-gestisciMutuo"),
	 OP_MUT_leggiMutuo("OP-MUT-leggiMutuo"),

	 OP_COM_gestisciCFG("OP-COM-gestisciCFG"),
	 OP_SPE_insMan("OP-SPE-insMan"),
	 OP_SPE_insManQuietanza("OP-SPE-insManQuietanza"),
	
	
	 LEGGI_IMP("OP-SPE-leggiImpegno"),
	 LEGGI_ACC("OP-ENT-leggiAccertamento"),
	
	
	 OP_SPE_insLiq("OP-SPE-insLiq"),
	
	 OP_SPE_RICMAN("OP-SPE-ricMan"),
	 OP_SPE_insLiqMan("OP-SPE-insLiqMan"),
	
	 OP_SPE_LEGGIPROVVCASSA("OP-OIL-leggiProvvisoriCassa"),
	 OP_SPE_INSPROVVCASSA("OP-OIL-InsProvvisorioCassa"),
	 OP_SPE_AGGPROVVCASSA("OP-OIL-aggProvvisoriCassa"),
	 OP_SPE_GESTPROVVCASSA("OP-OIL-GestProvvisorioCassa"),
	 OP_OIL_AGG_DEC_PROVV_CASSA("OP-OIL-aggDecProvvisoriCassa"),
	
	
	 OP_SPE_aggMan("OP-SPE-aggMan"),
	 OP_SPE_aggManQuietanza("OP-SPE-aggManQuietanza"),
	 OP_SPE_varMan("OP-SPE-varMan"),
	 OP_SPE_AGGMAN("OP-SPE-aggMan"),
	 OP_SPE_REINTROITO_ORD_PAG("OP-SPE-reintroitoOrdPag"),
	
	
	 OP_ENT_INS_ORD_INC_QUIETANZA("OP-ENT-insOrdIncQuietanza"),
	 OP_ENT_insOrdInc("OP-ENT-insOrdInc"),
	 OP_ENT_insAcc("OP-ENT-insAcc"),
	 OP_ENT_RICORDINC("OP-ENT-ricOrdInc"),
	 OP_ENT_AGGORDINC("OP-ENT-aggOrdInc"),
	 OP_ENT_VARORDINC("OP-ENT-varOrdInc"),

	
	 OP_SPE_ricCarta("OP-SPE-ricCarta"),
	 OP_SPE_INSCARTA("OP-SPE-insCarta"),
	 OP_SPE_AGGCARTA("OP-SPE-aggCarta"),
	 OP_SPE_AGGCARTARAGIO("OP-SPE-aggCartaRagio"),
	 OP_SPE_regCarta("OP-SPE-regCarta"),
	
	
	 LEGGI_IMP_ROR("OP-SPE-gestImprROR"),
	 LEGGI_IMP_ROR_DECENTRATO("OP-SPE-gestImpRORdecentrato"),
	 LEGGI_ACC_ROR("OP-ENT-gestAccROR"),
	 LEGGI_ACC_ROR_DECENTRATO("OP-ENT-gestAccRORdecentrato"),
	 
	//SIAC-8046 CM 18-29/03/2021 Task 2.1 Inizio
	AGGIORNA_ANNO_NUMERO_ACCERTAMENTO_RICONCILIAZIONE("OP-CRUSCOTTO-aggiornaAccPagopa"),
	//SIAC-8046 CM 18-29/03/2021 Task 2.1 Fine
	PREVISIONE_IMPEGNATO_ACCERTATO("OP-GESC090-prevImpegnatoAccertatoCap"),
	
	//SIAC-7858
	OP_ENT_CONFSTPFCDE_GES_BOZZA("OP-ENT-ConfStpFdceGes-Bozza")
	
	;
	/** Il nome dell'azione */
	private String nomeAzione;
	
	/**
	 * Costruttore a partire dal nome dell'azione.
	 * 
	 * @param nomeAzione il nome dell'azione da impostare
	 */
	private AzioneConsentitaEnum(String nomeAzione) {
		this.nomeAzione = nomeAzione;
	}

	/**
	 * @return the nomeAzione
	 */
	public String getNomeAzione() {
		return nomeAzione;
	}

	/**
	 * @param nomeAzione the nomeAzione to set
	 */
	public void setNomeAzione(String nomeAzione) {
		this.nomeAzione = nomeAzione;
	}
	
	/**
	 * Crea l'azione richiesta a partire da quelle consentite all'utente e corrispondenti al nome.
	 * 
	 * @param azioniConsentite le azioni consentite all'utente
	 * 
	 * @return l'azione richiesta corrispondente al nome, se presente; <code>null</code> in caso contrario
	 */
	public AzioneRichiesta creaAzioneRichiesta(List<AzioneConsentita> azioniConsentite) {
		for(AzioneConsentita az : azioniConsentite) {
			final Azione azione = az.getAzione();
			if(this.nomeAzione.equalsIgnoreCase(azione.getNome())) {
				final AzioneRichiesta azioneRichiesta = new AzioneRichiesta();
				azioneRichiesta.setAzione(azione);
				return azioneRichiesta;
			}
		}
		// Non ho trovato nulla
		return null;
	}
	
	
	public static boolean isConsentito(AzioneConsentitaEnum azione, List<AzioneConsentita> listaAzioniConsentite) {
		for(AzioneConsentita azioneConsentita : listaAzioniConsentite) {
			if(azioneConsentita.getAzione().getNome().equalsIgnoreCase(azione.getNomeAzione())) {
				return true;
			}
		}
		return false;
	}

	public static boolean isConsentitoAll(List<AzioneConsentita> listaAzioniConsentite, AzioneConsentitaEnum... azioni) {
		boolean consentito = !listaAzioniConsentite.isEmpty() && azioni != null && azioni.length > 0;
		for(int i = 0; consentito && i < azioni.length; i++) {
			AzioneConsentitaEnum azione = azioni[i];
			// Ripristino il booleano a false
			consentito = false;
			
			for(Iterator<AzioneConsentita> it = listaAzioniConsentite.iterator(); it.hasNext() && !consentito;) {
				AzioneConsentita az = it.next();
				if(az.getAzione().getNome().equalsIgnoreCase(azione.getNomeAzione())) {
					consentito = true;
				}
			}
		}
		return consentito;
	}

}
