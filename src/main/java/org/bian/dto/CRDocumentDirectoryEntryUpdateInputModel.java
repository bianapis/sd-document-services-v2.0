package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryUpdateInputModelDocumentDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryUpdateInputModel
 */
public class CRDocumentDirectoryEntryUpdateInputModel   {
  private String documentServicesServicingSessionReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private CRDocumentDirectoryEntryUpdateInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;

  private Object documentDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get documentDirectoryEntryInstanceRecord
   * @return documentDirectoryEntryInstanceRecord
  **/

  public CRDocumentDirectoryEntryUpdateInputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryUpdateInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return documentDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getDocumentDirectoryEntryUpdateActionTaskRecord() {
    return documentDirectoryEntryUpdateActionTaskRecord;
  }

  public void setDocumentDirectoryEntryUpdateActionTaskRecord(Object documentDirectoryEntryUpdateActionTaskRecord) {
    this.documentDirectoryEntryUpdateActionTaskRecord = documentDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

