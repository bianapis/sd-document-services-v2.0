package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRequestOutputModel
 */
public class CRDocumentDirectoryEntryRequestOutputModel   {
  private CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;

  private String documentDirectoryEntryRequestActionTaskReference = null;

  private Object documentDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get documentDirectoryEntryInstanceRecord
   * @return documentDirectoryEntryInstanceRecord
  **/

  public CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document Directory Entry instance request service call 
   * @return documentDirectoryEntryRequestActionTaskReference
  **/

  public String getDocumentDirectoryEntryRequestActionTaskReference() {
    return documentDirectoryEntryRequestActionTaskReference;
  }

  public void setDocumentDirectoryEntryRequestActionTaskReference(String documentDirectoryEntryRequestActionTaskReference) {
    this.documentDirectoryEntryRequestActionTaskReference = documentDirectoryEntryRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

