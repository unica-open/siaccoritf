/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.util.entita;

import it.csi.siac.siaccommon.util.ReflectionUtil;
import it.csi.siac.siaccorser.model.Entita;

public class EntitaUtils {

	private EntitaUtils() {
	}

	public static <E extends Entita> E newInstance(Class<E> cls, Integer uid) {
		E entita = ReflectionUtil.silentlyBuildInstance(cls);
		entita.setUid(uid);
		return entita;
	}
	
}
