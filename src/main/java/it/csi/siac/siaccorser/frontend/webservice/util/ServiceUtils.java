/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.util;

import it.csi.siac.siaccommon.util.ReflectionUtil;
import it.csi.siac.siaccommon.util.date.DateUtil;
import it.csi.siac.siaccorser.frontend.webservice.exception.ServiceException;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.Richiedente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.ServiceResponse;

public final class ServiceUtils {


	private ServiceUtils() {
	}

	public static <R extends ServiceRequest> R createRequest(Class<R> cls, Richiedente richiedente, Integer annoBilancio) {
		R request = ReflectionUtil.silentlyBuildInstance(cls);
		request.setDataOra(DateUtil.now());
		request.setRichiedente(richiedente);
		request.setAnnoBilancio(annoBilancio);
		return request;
	}
	
	public static <RES extends ServiceResponse> void checkServiceResponse(RES res) {
		if (res == null) {
			throw new NullPointerException("La response del servizio di business è null");
		}

		if (res.isFallimento()) {
			throw new ServiceException(res.getErrori());
		}
	}

	public static void assertNotNull(Object object, Errore errore) throws ServiceException {
		assertCondition(object != null, errore);
	}
	
	public static void assertCondition(boolean condition, Errore errore) throws ServiceException {
		if (!condition) {
			throw new ServiceException(errore);
		}
	}
}
