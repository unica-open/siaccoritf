/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.model.file;

public interface TipoFileHandler {

	public String[] getAzioni();

	public Object execute(Integer indexAzioneTipoFile, Object...parameters) throws Exception;
}
