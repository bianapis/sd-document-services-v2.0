package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryUpdateOutputModel
 */
public class CRDocumentDirectoryEntryUpdateOutputModel   {
  private CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord = null;

  private String documentDirectoryEntryUpdateActionTaskReference = null;

  private Object documentDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get documentDirectoryEntryInstanceRecord
   * @return documentDirectoryEntryInstanceRecord
  **/

  public CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord getDocumentDirectoryEntryInstanceRecord() {
    return documentDirectoryEntryInstanceRecord;
  }

  public void setDocumentDirectoryEntryInstanceRecord(CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord documentDirectoryEntryInstanceRecord) {
    this.documentDirectoryEntryInstanceRecord = documentDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return documentDirectoryEntryUpdateActionTaskReference
  **/

  public String getDocumentDirectoryEntryUpdateActionTaskReference() {
    return documentDirectoryEntryUpdateActionTaskReference;
  }

  public void setDocumentDirectoryEntryUpdateActionTaskReference(String documentDirectoryEntryUpdateActionTaskReference) {
    this.documentDirectoryEntryUpdateActionTaskReference = documentDirectoryEntryUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

