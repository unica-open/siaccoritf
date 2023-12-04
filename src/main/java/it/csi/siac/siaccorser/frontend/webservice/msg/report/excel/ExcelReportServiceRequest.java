/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg.report.excel;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceRequest;

@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class ExcelReportServiceRequest extends ReportServiceRequest {
		
	private Boolean xlsx = Boolean.TRUE;


	public Boolean getXlsx() {
		return xlsx;
	}

	public void setXlsx(Boolean xlsx) {
		this.xlsx = xlsx;
	}
}
