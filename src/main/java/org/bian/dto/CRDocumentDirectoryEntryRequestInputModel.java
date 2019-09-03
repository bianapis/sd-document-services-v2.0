package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRequestInputModelDocumentDirectoryEntryInstanceRecord;
import org.bian.dto.CRDocumentDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRequestInputModel
 */
public class CRDocumentDirectoryEntryRequestInputModel   {
  private String documentServicesServicingSessionReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private CRDocumentDirectoryEntryRequestInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;

  private Object documentDirectoryEntryRequestActionTaskRecord = null;

  private CRDocumentDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRDocumentDirectoryEntryRequestInputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryRequestInputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return documentDirectoryEntryRequestActionTaskRecord
  **/

  public Object getDocumentDirectoryEntryRequestActionTaskRecord() {
    return documentDirectoryEntryRequestActionTaskRecord;
  }

  public void setDocumentDirectoryEntryRequestActionTaskRecord(Object documentDirectoryEntryRequestActionTaskRecord) {
    this.documentDirectoryEntryRequestActionTaskRecord = documentDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRDocumentDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRDocumentDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

