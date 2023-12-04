/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccorser.frontend.webservice.msg.report.excel;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.util.MimeType;
import it.csi.siac.siaccorser.frontend.webservice.CORSvcDictionary;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceResponse;

@XmlType(namespace = CORSvcDictionary.NAMESPACE)
public class ExcelReportServiceResponse extends ReportServiceResponse {
	
	private byte[] report;
	private Boolean xlsx;
	private MimeType contentType;
	private String extension;

	public byte[] getReport() {
		return report;
	}

	public void setReport(byte[] report) {
		this.report = report;
	}

	public Boolean getXlsx() {
		return xlsx;
	}

	public void setXlsx(Boolean xlsx) {
		this.xlsx = xlsx;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public MimeType getContentType() {
		return contentType;
	}

	public void setContentType(MimeType contentType) {
		this.contentType = contentType;
	}

}
