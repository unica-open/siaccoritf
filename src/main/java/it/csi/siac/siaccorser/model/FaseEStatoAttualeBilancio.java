/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CORDataDictionary.NAMESPACE)
public class FaseEStatoAttualeBilancio extends EntitaStoricizzata {

	private static final long serialVersionUID = -2157480192035205000L;

	private StatoBilancio statoBilancio;
	private FaseBilancio faseBilancio;

	
	public StatoBilancio getStatoBilancio() {
		return statoBilancio;
	}

	public void setStatoBilancio(StatoBilancio statoBilancio) {
		this.statoBilancio = statoBilancio;
	}

	public FaseBilancio getFaseBilancio() {
		return faseBilancio;
	}

	public void setFaseBilancio(FaseBilancio faseBilancio) {
		this.faseBilancio = faseBilancio;

	}
}
