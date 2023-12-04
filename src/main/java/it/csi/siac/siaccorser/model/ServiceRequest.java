/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.UserSessionInfo;

/**
 * Base di tutte le richieste
 * 
 * @author alagna
 * @version $Id: $
 */
@XmlType(namespace = CORDataDictionary.NAMESPACE)
public abstract class ServiceRequest {
	private Richiedente richiedente;
	private Date dataOra;
	private Integer annoBilancio; // FIXME
	private UserSessionInfo userSessionInfo;
	
	/**
	 * Può essere implementata dalle sottoclassi per gestire la velidazione
	 * @return
	 */
	public List<Errore> valida() {
		return new ArrayList<Errore>();
	}
	
	public boolean isValida() {
		return valida().isEmpty();
	}

	public Richiedente getRichiedente() {
		return richiedente;
	}

	public void setRichiedente(Richiedente richiedente) {
		this.richiedente = richiedente;
	}

	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	/** data e ora della richiesta **/
	@XmlSchemaType(name = "dateTime")
	public Date getDataOra() {
		return dataOra;
	}

	public Integer getAnnoBilancio() {
		return annoBilancio;
	}

	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
	}

	public UserSessionInfo getUserSessionInfo() {
		return userSessionInfo;
	}

	public void setUserSessionInfo(UserSessionInfo userSessionInfo) {
		this.userSessionInfo = userSessionInfo;
	}
	
	public Ente getEnte() {
		
		if(richiedente == null) {
			return null;
		}
		
		if(richiedente.getAccount() == null) {
			return null;
		}
		
		return richiedente.getAccount().getEnte();
	}
}
