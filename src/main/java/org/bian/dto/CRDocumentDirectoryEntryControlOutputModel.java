package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryControlOutputModel
 */
public class CRDocumentDirectoryEntryControlOutputModel   {
  private String documentDirectoryEntryControlActionTaskReference = null;

  private Object documentDirectoryEntryControlActionTaskRecord = null;

  private String documentDirectoryEntryControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document Directory Entry instance control processing service call 
   * @return documentDirectoryEntryControlActionTaskReference
  **/

  public String getDocumentDirectoryEntryControlActionTaskReference() {
    return documentDirectoryEntryControlActionTaskReference;
  }

  public void setDocumentDirectoryEntryControlActionTaskReference(String documentDirectoryEntryControlActionTaskReference) {
    this.documentDirectoryEntryControlActionTaskReference = documentDirectoryEntryControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return documentDirectoryEntryControlActionTaskRecord
  **/

  public Object getDocumentDirectoryEntryControlActionTaskRecord() {
    return documentDirectoryEntryControlActionTaskRecord;
  }

  public void setDocumentDirectoryEntryControlActionTaskRecord(Object documentDirectoryEntryControlActionTaskRecord) {
    this.documentDirectoryEntryControlActionTaskRecord = documentDirectoryEntryControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return documentDirectoryEntryControlActionResponse
  **/

  public String getDocumentDirectoryEntryControlActionResponse() {
    return documentDirectoryEntryControlActionResponse;
  }

  public void setDocumentDirectoryEntryControlActionResponse(String documentDirectoryEntryControlActionResponse) {
    this.documentDirectoryEntryControlActionResponse = documentDirectoryEntryControlActionResponse;
  }


}

