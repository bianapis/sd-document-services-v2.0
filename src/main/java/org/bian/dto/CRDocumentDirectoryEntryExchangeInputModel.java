package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryExchangeInputModelDocumentDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryExchangeInputModel
 */
public class CRDocumentDirectoryEntryExchangeInputModel   {
  private String documentServicesServicingSessionReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private Object documentDirectoryEntryExchangeActionTaskRecord = null;

  private CRDocumentDirectoryEntryExchangeInputModelDocumentDirectoryEntryExchangeActionRequest documentDirectoryEntryExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return documentServicesServicingSessionReference
  **/

  public String getDocumentServicesServicingSessionReference() {
    return documentServicesServicingSessionReference;
  }

  public void setDocumentServicesServicingSessionReference(String documentServicesServicingSessionReference) {
    this.documentServicesServicingSessionReference = documentServicesServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Document Directory Entry instance 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
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
   * Get documentDirectoryEntryExchangeActionRequest
   * @return documentDirectoryEntryExchangeActionRequest
  **/

  public CRDocumentDirectoryEntryExchangeInputModelDocumentDirectoryEntryExchangeActionRequest getDocumentDirectoryEntryExchangeActionRequest() {
    return documentDirectoryEntryExchangeActionRequest;
  }

  public void setDocumentDirectoryEntryExchangeActionRequest(CRDocumentDirectoryEntryExchangeInputModelDocumentDirectoryEntryExchangeActionRequest documentDirectoryEntryExchangeActionRequest) {
    this.documentDirectoryEntryExchangeActionRequest = documentDirectoryEntryExchangeActionRequest;
  }


}

