package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRegisterInputModelDocumentDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRegisterInputModel
 */
public class CRDocumentDirectoryEntryRegisterInputModel   {
  private String documentServicesServicingSessionReference = null;

  private Object documentDirectoryEntryRegisterActionRecord = null;

  private String documentDirectoryEntryInstanceStatus = null;

  private CRDocumentDirectoryEntryRegisterInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return documentDirectoryEntryRegisterActionRecord
  **/

  public Object getDocumentDirectoryEntryRegisterActionRecord() {
    return documentDirectoryEntryRegisterActionRecord;
  }

  public void setDocumentDirectoryEntryRegisterActionRecord(Object documentDirectoryEntryRegisterActionRecord) {
    this.documentDirectoryEntryRegisterActionRecord = documentDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Document Directory Entry instance (e.g. initialised, pending, active) 
   * @return documentDirectoryEntryInstanceStatus
  **/

  public String getDocumentDirectoryEntryInstanceStatus() {
    return documentDirectoryEntryInstanceStatus;
  }

  public void setDocumentDirectoryEntryInstanceStatus(String documentDirectoryEntryInstanceStatus) {
    this.documentDirectoryEntryInstanceStatus = documentDirectoryEntryInstanceStatus;
  }


  /**
   * Get documentDirectoryEntryInstanceRecord
   * @return documentDirectoryEntryInstanceRecord
  **/

  public CRDocumentDirectoryEntryRegisterInputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryRegisterInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


}

