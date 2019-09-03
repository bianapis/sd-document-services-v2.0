package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord
 */
public class CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord   {
  private String documentDirectoryEntryInstanceReportData = null;

  private String documentDirectoryEntryInstanceReportType = null;

  private Object documentDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return documentDirectoryEntryInstanceReportData
  **/

  public String getDocumentDirectoryEntryInstanceReportData() {
    return documentDirectoryEntryInstanceReportData;
  }

  public void setDocumentDirectoryEntryInstanceReportData(String documentDirectoryEntryInstanceReportData) {
    this.documentDirectoryEntryInstanceReportData = documentDirectoryEntryInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return documentDirectoryEntryInstanceReportType
  **/

  public String getDocumentDirectoryEntryInstanceReportType() {
    return documentDirectoryEntryInstanceReportType;
  }

  public void setDocumentDirectoryEntryInstanceReportType(String documentDirectoryEntryInstanceReportType) {
    this.documentDirectoryEntryInstanceReportType = documentDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return documentDirectoryEntryInstanceReport
  **/

  public Object getDocumentDirectoryEntryInstanceReport() {
    return documentDirectoryEntryInstanceReport;
  }

  public void setDocumentDirectoryEntryInstanceReport(Object documentDirectoryEntryInstanceReport) {
    this.documentDirectoryEntryInstanceReport = documentDirectoryEntryInstanceReport;
  }


}

