package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord
 */
public class CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceReportRecord   {
  private String documentDirectoryEntryInstanceReportReference = null;

  private String documentDirectoryEntryInstanceReportType = null;

  private String documentDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return documentDirectoryEntryInstanceReportReference
  **/

  public String getDocumentDirectoryEntryInstanceReportReference() {
    return documentDirectoryEntryInstanceReportReference;
  }

  public void setDocumentDirectoryEntryInstanceReportReference(String documentDirectoryEntryInstanceReportReference) {
    this.documentDirectoryEntryInstanceReportReference = documentDirectoryEntryInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return documentDirectoryEntryInstanceReportParameters
  **/

  public String getDocumentDirectoryEntryInstanceReportParameters() {
    return documentDirectoryEntryInstanceReportParameters;
  }

  public void setDocumentDirectoryEntryInstanceReportParameters(String documentDirectoryEntryInstanceReportParameters) {
    this.documentDirectoryEntryInstanceReportParameters = documentDirectoryEntryInstanceReportParameters;
  }


}

