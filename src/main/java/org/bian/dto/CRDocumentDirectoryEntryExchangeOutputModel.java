package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryExchangeOutputModel
 */
public class CRDocumentDirectoryEntryExchangeOutputModel   {
  private String documentDirectoryEntryExchangeActionTaskReference = null;

  private Object documentDirectoryEntryExchangeActionTaskRecord = null;

  private String documentDirectoryEntryExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document Directory Entry instance exchange service call 
   * @return documentDirectoryEntryExchangeActionTaskReference
  **/

  public String getDocumentDirectoryEntryExchangeActionTaskReference() {
    return documentDirectoryEntryExchangeActionTaskReference;
  }

  public void setDocumentDirectoryEntryExchangeActionTaskReference(String documentDirectoryEntryExchangeActionTaskReference) {
    this.documentDirectoryEntryExchangeActionTaskReference = documentDirectoryEntryExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return documentDirectoryEntryExchangeActionTaskRecord
  **/

  public Object getDocumentDirectoryEntryExchangeActionTaskRecord() {
    return documentDirectoryEntryExchangeActionTaskRecord;
  }

  public void setDocumentDirectoryEntryExchangeActionTaskRecord(Object documentDirectoryEntryExchangeActionTaskRecord) {
    this.documentDirectoryEntryExchangeActionTaskRecord = documentDirectoryEntryExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return documentDirectoryEntryExchangeActionResponse
  **/

  public String getDocumentDirectoryEntryExchangeActionResponse() {
    return documentDirectoryEntryExchangeActionResponse;
  }

  public void setDocumentDirectoryEntryExchangeActionResponse(String documentDirectoryEntryExchangeActionResponse) {
    this.documentDirectoryEntryExchangeActionResponse = documentDirectoryEntryExchangeActionResponse;
  }


}

