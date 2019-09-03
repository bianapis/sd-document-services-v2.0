package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveInputModel
 */
public class CRDocumentDirectoryEntryRetrieveInputModel   {
  private Object documentDirectoryEntryRetrieveActionTaskRecord = null;

  private String documentDirectoryEntryRetrieveActionRequest = null;

  private CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord documentDirectoryEntryInstanceReportRecord = null;

  private CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis documentDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getDocumentDirectoryEntryRetrieveActionTaskRecord() {
    return documentDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setDocumentDirectoryEntryRetrieveActionTaskRecord(Object documentDirectoryEntryRetrieveActionTaskRecord) {
    this.documentDirectoryEntryRetrieveActionTaskRecord = documentDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return documentDirectoryEntryRetrieveActionRequest
  **/

  public String getDocumentDirectoryEntryRetrieveActionRequest() {
    return documentDirectoryEntryRetrieveActionRequest;
  }

  public void setDocumentDirectoryEntryRetrieveActionRequest(String documentDirectoryEntryRetrieveActionRequest) {
    this.documentDirectoryEntryRetrieveActionRequest = documentDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get documentDirectoryEntryInstanceReportRecord
   * @return documentDirectoryEntryInstanceReportRecord
  **/

  public CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord getDocumentDirectoryEntryInstanceReportRecord() {
    return documentDirectoryEntryInstanceReportRecord;
  }

  public void setDocumentDirectoryEntryInstanceReportRecord(CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord documentDirectoryEntryInstanceReportRecord) {
    this.documentDirectoryEntryInstanceReportRecord = documentDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get documentDirectoryEntryInstanceAnalysis
   * @return documentDirectoryEntryInstanceAnalysis
  **/

  public CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis getDocumentDirectoryEntryInstanceAnalysis() {
    return documentDirectoryEntryInstanceAnalysis;
  }

  public void setDocumentDirectoryEntryInstanceAnalysis(CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis documentDirectoryEntryInstanceAnalysis) {
    this.documentDirectoryEntryInstanceAnalysis = documentDirectoryEntryInstanceAnalysis;
  }


}

