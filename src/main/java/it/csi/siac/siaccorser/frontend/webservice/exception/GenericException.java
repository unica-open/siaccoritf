/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.exception;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siaccorser.model.Errore;

public abstract class GenericException extends RuntimeException {

	private static final long serialVersionUID = -6887572962078816981L;
	private final List<Errore> errori;

	protected GenericException() {
		this((String)null);
	}

	public GenericException(String message) {
		super(message);
		this.errori = new ArrayList<Errore>();
	}

	public GenericException(Errore errore) {
		this(errore.getTesto());
		errori.add(errore);
	}

	public GenericException(List<Errore> errori) {
		this.errori = errori;
	}

	public List<Errore> getErrori() {
		return errori;
	}
}
