package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceRecord;
import org.bian.dto.CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveOutputModel
 */
public class CRDocumentDirectoryEntryRetrieveOutputModel   {
  private CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;

  private String documentDirectoryEntryRetrieveActionTaskReference = null;

  private Object documentDirectoryEntryRetrieveActionTaskRecord = null;

  private String documentDirectoryEntryRetrieveActionResponse = null;

  private CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord documentDirectoryEntryInstanceReportRecord = null;

  private CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis documentDirectoryEntryInstanceAnalysis = null;


  /**
   * Get documentDirectoryEntryInstanceRecord
   * @return documentDirectoryEntryInstanceRecord
  **/

  public CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document Directory Entry instance retrieve service call 
   * @return documentDirectoryEntryRetrieveActionTaskReference
  **/

  public String getDocumentDirectoryEntryRetrieveActionTaskReference() {
    return documentDirectoryEntryRetrieveActionTaskReference;
  }

  public void setDocumentDirectoryEntryRetrieveActionTaskReference(String documentDirectoryEntryRetrieveActionTaskReference) {
    this.documentDirectoryEntryRetrieveActionTaskReference = documentDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return documentDirectoryEntryRetrieveActionResponse
  **/

  public String getDocumentDirectoryEntryRetrieveActionResponse() {
    return documentDirectoryEntryRetrieveActionResponse;
  }

  public void setDocumentDirectoryEntryRetrieveActionResponse(String documentDirectoryEntryRetrieveActionResponse) {
    this.documentDirectoryEntryRetrieveActionResponse = documentDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get documentDirectoryEntryInstanceReportRecord
   * @return documentDirectoryEntryInstanceReportRecord
  **/

  public CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord getDocumentDirectoryEntryInstanceReportRecord() {
    return documentDirectoryEntryInstanceReportRecord;
  }

  public void setDocumentDirectoryEntryInstanceReportRecord(CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceReportRecord documentDirectoryEntryInstanceReportRecord) {
    this.documentDirectoryEntryInstanceReportRecord = documentDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get documentDirectoryEntryInstanceAnalysis
   * @return documentDirectoryEntryInstanceAnalysis
  **/

  public CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis getDocumentDirectoryEntryInstanceAnalysis() {
    return documentDirectoryEntryInstanceAnalysis;
  }

  public void setDocumentDirectoryEntryInstanceAnalysis(CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis documentDirectoryEntryInstanceAnalysis) {
    this.documentDirectoryEntryInstanceAnalysis = documentDirectoryEntryInstanceAnalysis;
  }


}

