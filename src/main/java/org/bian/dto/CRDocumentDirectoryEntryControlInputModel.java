package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryControlInputModelDocumentDirectoryEntryControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryControlInputModel
 */
public class CRDocumentDirectoryEntryControlInputModel   {
  private String documentServicesServicingSessionReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private Object documentDirectoryEntryControlActionTaskRecord = null;

  private CRDocumentDirectoryEntryControlInputModelDocumentDirectoryEntryControlActionRequest documentDirectoryEntryControlActionRequest = null;


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
   * Get documentDirectoryEntryControlActionRequest
   * @return documentDirectoryEntryControlActionRequest
  **/

  public CRDocumentDirectoryEntryControlInputModelDocumentDirectoryEntryControlActionRequest getDocumentDirectoryEntryControlActionRequest() {
    return documentDirectoryEntryControlActionRequest;
  }

  public void setDocumentDirectoryEntryControlActionRequest(CRDocumentDirectoryEntryControlInputModelDocumentDirectoryEntryControlActionRequest documentDirectoryEntryControlActionRequest) {
    this.documentDirectoryEntryControlActionRequest = documentDirectoryEntryControlActionRequest;
  }


}

