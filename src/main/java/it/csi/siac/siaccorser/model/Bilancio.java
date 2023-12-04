/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CORDataDictionary.NAMESPACE)
public class Bilancio extends Entita {

	private static final long serialVersionUID = -4890171962466873894L;

	private int anno;
	
	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		return faseEStatoAttualeBilancio;
	}

	public void setFaseEStatoAttualeBilancio(FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
	}
	
	public static Bilancio getInstanceForUid(int uid) {
		Bilancio b = new Bilancio();
		b.setUid(uid);
		return b;
	}

	public StatoBilancio getStatoAttuale() {
		return faseEStatoAttualeBilancio == null ? null : faseEStatoAttualeBilancio.getStatoBilancio();
	}

	public FaseBilancio getFaseAttuale() {
		return faseEStatoAttualeBilancio == null ? null : faseEStatoAttualeBilancio.getFaseBilancio();
	}
	
	public void setFaseAttuale(FaseBilancio faseBilancio) {
		if (faseEStatoAttualeBilancio == null) {
			faseEStatoAttualeBilancio = new FaseEStatoAttualeBilancio();
		}
		
		faseEStatoAttualeBilancio.setFaseBilancio(faseBilancio);
	}
	
	public boolean isInFaseAttuale(FaseBilancio...fasiBilancio) {
		if (fasiBilancio == null) {
			return false;
		}		
		
		FaseBilancio faseAttuale = getFaseAttuale();
		
		if (faseAttuale == null) {
			throw new IllegalStateException("Fase bilancio");
		}		

		for (FaseBilancio faseBilancio : fasiBilancio) {
			if (faseBilancio.equals(faseAttuale)) {
				return true;
			}
		}
		
		return false;
	}
}
