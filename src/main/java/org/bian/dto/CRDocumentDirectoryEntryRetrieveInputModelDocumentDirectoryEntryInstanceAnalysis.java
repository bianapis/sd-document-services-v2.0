package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis
 */
public class CRDocumentDirectoryEntryRetrieveInputModelDocumentDirectoryEntryInstanceAnalysis   {
  private String documentDirectoryEntryInstanceAnalysisReference = null;

  private String documentDirectoryEntryInstanceAnalysisReportType = null;

  private String documentDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return documentDirectoryEntryInstanceAnalysisReference
  **/

  public String getDocumentDirectoryEntryInstanceAnalysisReference() {
    return documentDirectoryEntryInstanceAnalysisReference;
  }

  public void setDocumentDirectoryEntryInstanceAnalysisReference(String documentDirectoryEntryInstanceAnalysisReference) {
    this.documentDirectoryEntryInstanceAnalysisReference = documentDirectoryEntryInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return documentDirectoryEntryInstanceAnalysisReportType
  **/

  public String getDocumentDirectoryEntryInstanceAnalysisReportType() {
    return documentDirectoryEntryInstanceAnalysisReportType;
  }

  public void setDocumentDirectoryEntryInstanceAnalysisReportType(String documentDirectoryEntryInstanceAnalysisReportType) {
    this.documentDirectoryEntryInstanceAnalysisReportType = documentDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return documentDirectoryEntryInstanceAnalysisParameters
  **/

  public String getDocumentDirectoryEntryInstanceAnalysisParameters() {
    return documentDirectoryEntryInstanceAnalysisParameters;
  }

  public void setDocumentDirectoryEntryInstanceAnalysisParameters(String documentDirectoryEntryInstanceAnalysisParameters) {
    this.documentDirectoryEntryInstanceAnalysisParameters = documentDirectoryEntryInstanceAnalysisParameters;
  }


}

