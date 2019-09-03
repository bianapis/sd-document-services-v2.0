package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRegisterOutputModelDocumentDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRegisterOutputModel
 */
public class CRDocumentDirectoryEntryRegisterOutputModel   {
  private String documentDirectoryEntryInstanceReference = null;

  private String documentDirectoryEntryRegisterActionReference = null;

  private Object documentDirectoryEntryRegisterActionRecord = null;

  private String documentDirectoryEntryInstanceStatus = null;

  private CRDocumentDirectoryEntryRegisterOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return documentDirectoryEntryRegisterActionReference
  **/

  public String getDocumentDirectoryEntryRegisterActionReference() {
    return documentDirectoryEntryRegisterActionReference;
  }

  public void setDocumentDirectoryEntryRegisterActionReference(String documentDirectoryEntryRegisterActionReference) {
    this.documentDirectoryEntryRegisterActionReference = documentDirectoryEntryRegisterActionReference;
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

  public CRDocumentDirectoryEntryRegisterOutputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryRegisterOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


}

