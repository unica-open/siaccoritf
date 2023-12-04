/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * OperazioneAsincrona
 * 
 * @author rmontuori
 * 
 **/
@XmlType(namespace = CORDataDictionary.NAMESPACE)
public class OperazioneAsincrona implements Serializable {

	private static final long serialVersionUID = 5723441380660830279L;

	private Integer idOpAsinc;
	private String messaggio;
	private String stato;
	private Date opasAvvio;
	private Date opasFine;
	
	public Integer getIdOpAsinc() {
		return idOpAsinc;
	}
	public void setIdOpAsinc(Integer idOpAsinc) {
		this.idOpAsinc = idOpAsinc;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Date getOpasAvvio() {
		return opasAvvio;
	}
	public void setOpasAvvio(Date opasAvvio) {
		this.opasAvvio = opasAvvio;
	}
	public Date getOpasFine() {
		return opasFine;
	}
	public void setOpasFine(Date opasFine) {
		this.opasFine = opasFine;
	}
	
	

}
