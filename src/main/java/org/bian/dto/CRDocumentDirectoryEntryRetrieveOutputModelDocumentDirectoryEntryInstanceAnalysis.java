package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis
 */
public class CRDocumentDirectoryEntryRetrieveOutputModelDocumentDirectoryEntryInstanceAnalysis   {
  private String documentDirectoryEntryInstanceAnalysisData = null;

  private String documentDirectoryEntryInstanceAnalysisReportType = null;

  private Object documentDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return documentDirectoryEntryInstanceAnalysisData
  **/

  public String getDocumentDirectoryEntryInstanceAnalysisData() {
    return documentDirectoryEntryInstanceAnalysisData;
  }

  public void setDocumentDirectoryEntryInstanceAnalysisData(String documentDirectoryEntryInstanceAnalysisData) {
    this.documentDirectoryEntryInstanceAnalysisData = documentDirectoryEntryInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return documentDirectoryEntryInstanceAnalysisReport
  **/

  public Object getDocumentDirectoryEntryInstanceAnalysisReport() {
    return documentDirectoryEntryInstanceAnalysisReport;
  }

  public void setDocumentDirectoryEntryInstanceAnalysisReport(Object documentDirectoryEntryInstanceAnalysisReport) {
    this.documentDirectoryEntryInstanceAnalysisReport = documentDirectoryEntryInstanceAnalysisReport;
  }


}

