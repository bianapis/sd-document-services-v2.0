package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord
 */
public class CRDocumentDirectoryEntryRequestOutputModelDocumentDirectoryEntryInstanceRecord   {
  private String documentProvisioningHistory = null;

  private String documentVersionHistory = null;

  private String documentVerificationHistory = null;

  private String documentAmendmentHistory = null;

  private String documentUpdateHistory = null;

  private String documentArchivingHistory = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the movements of the document, from the original request for submission, through reference and access and eventual archiving documentProvisioningSchedule:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The planned and actual schedule for receipt and return as appropriate, including any time limits or deadlines documentProvisioningResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The result of the provisioning action (e.g. document received, document not provided in time) 
   * @return documentProvisioningHistory
  **/

  public String getDocumentProvisioningHistory() {
    return documentProvisioningHistory;
  }

  public void setDocumentProvisioningHistory(String documentProvisioningHistory) {
    this.documentProvisioningHistory = documentProvisioningHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains links to earlier versions for a document with a replacement cycle documentVersion:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The version with overview as needed documentVersionDate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: The valid from-to dates for the version 
   * @return documentVersionHistory
  **/

  public String getDocumentVersionHistory() {
    return documentVersionHistory;
  }

  public void setDocumentVersionHistory(String documentVersionHistory) {
    this.documentVersionHistory = documentVersionHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks any verification tasks performed against the document documentVerificationTaskDescription:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: A description of the actions taken to verify the document documentVerificationServiceProviderReference:  type: string  example: \"782672\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to an external agency used to perform a verification service documentVerificationTaskResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The outcome of the verification assessment 
   * @return documentVerificationHistory
  **/

  public String getDocumentVerificationHistory() {
    return documentVerificationHistory;
  }

  public void setDocumentVerificationHistory(String documentVerificationHistory) {
    this.documentVerificationHistory = documentVerificationHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks any amendments or corrections made to the document documentAmendmentDescription:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Description of the amendment and the reason for the correction or change documentAmendmentResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The outcome of the amendment in terms of changes made 
   * @return documentAmendmentHistory
  **/

  public String getDocumentAmendmentHistory() {
    return documentAmendmentHistory;
  }

  public void setDocumentAmendmentHistory(String documentAmendmentHistory) {
    this.documentAmendmentHistory = documentAmendmentHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains an update log for a document with allowed updates documentUpdateDescription:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Description of the update and reason for the change documentUpdateResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The outcome of the update in terms of changes made 
   * @return documentUpdateHistory
  **/

  public String getDocumentUpdateHistory() {
    return documentUpdateHistory;
  }

  public void setDocumentUpdateHistory(String documentUpdateHistory) {
    this.documentUpdateHistory = documentUpdateHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains a log of the physical and electronic archiving of a document including retrieval activity as appropriate documentArchivingAction:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Details of an action to archive or retrieve a document documentArchiveReference:  type: string  example: \"725358\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The archive storage reference for a document 
   * @return documentArchivingHistory
  **/

  public String getDocumentArchivingHistory() {
    return documentArchivingHistory;
  }

  public void setDocumentArchivingHistory(String documentArchivingHistory) {
    this.documentArchivingHistory = documentArchivingHistory;
  }


}

