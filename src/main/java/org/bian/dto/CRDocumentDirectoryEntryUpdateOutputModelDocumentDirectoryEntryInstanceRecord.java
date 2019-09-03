package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord
 */
public class CRDocumentDirectoryEntryUpdateOutputModelDocumentDirectoryEntryInstanceRecord   {
  private String documentName = null;

  private String locationReference = null;

  private String businessUnitEmployeeReference = null;

  private String productServiceReference = null;

  private String productServiceActionReference = null;

  private String documentCreationDate = null;

  private String documentCaptureDateTime = null;

  private String documentTypeDescription = null;

  private String documentContent = null;

  private String documentProvisioningHistory = null;

  private String documentVersionHistory = null;

  private String documentVerificationHistory = null;

  private String documentAmendmentHistory = null;

  private String documentUpdateHistory = null;

  private String documentArchivingHistory = null;

  private String documentMediaFormat = null;

  private String documentSubjectReference = null;

  private String documentLocation = null;

  private String documentStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Descriptive name of the document 
   * @return documentName
  **/

  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Location within the bank where the original document is created/captured 
   * @return locationReference
  **/

  public String getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(String locationReference) {
    this.locationReference = locationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference of unit or employee responsible for creating or capturing the original 
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product or service 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product or service activity (clarifies why the document was captured) 
   * @return productServiceActionReference
  **/

  public String getProductServiceActionReference() {
    return productServiceActionReference;
  }

  public void setProductServiceActionReference(String productServiceActionReference) {
    this.productServiceActionReference = productServiceActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The creation date of the original document 
   * @return documentCreationDate
  **/

  public String getDocumentCreationDate() {
    return documentCreationDate;
  }

  public void setDocumentCreationDate(String documentCreationDate) {
    this.documentCreationDate = documentCreationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Date the document was first created/captured at the bank (can be the same as creation date for bank generated documents) 
   * @return documentCaptureDateTime
  **/

  public String getDocumentCaptureDateTime() {
    return documentCaptureDateTime;
  }

  public void setDocumentCaptureDateTime(String documentCaptureDateTime) {
    this.documentCaptureDateTime = documentCaptureDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the type and outline content of the document 
   * @return documentTypeDescription
  **/

  public String getDocumentTypeDescription() {
    return documentTypeDescription;
  }

  public void setDocumentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Retrievable document content in any suitable media and format 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the movements of the document, from the original request for submission, through reference and access and eventual archiving documentProvisioningRequest:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Details of the request to a holding party to provide access to a document documentProvisioningSchedule:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The planned and actual schedule for receipt and return as appropriate, including any time limits or deadlines documentProvisioningResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The result of the provisioning action (e.g. document received, document not provided in time) 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks any verification tasks performed against the document documentVerificationTaskDescription:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: A description of the actions taken to verify the document documentVerificationServiceProviderReference:  type: string  example: \"721747\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to an external agency used to perform a verification service documentVerificationTaskResult:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The outcome of the verification assessment 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains a log of the physical and electronic archiving of a document including retrieval activity as appropriate documentArchivingAction:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Details of an action to archive or retrieve a document documentArchiveReference:  type: string  example: \"762980\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The archive storage reference for a document 
   * @return documentArchivingHistory
  **/

  public String getDocumentArchivingHistory() {
    return documentArchivingHistory;
  }

  public void setDocumentArchivingHistory(String documentArchivingHistory) {
    this.documentArchivingHistory = documentArchivingHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The available media and format for storing and retrieving the document 
   * @return documentMediaFormat
  **/

  public String getDocumentMediaFormat() {
    return documentMediaFormat;
  }

  public void setDocumentMediaFormat(String documentMediaFormat) {
    this.documentMediaFormat = documentMediaFormat;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated parties (e.g. source, custodian, subject, owner) 
   * @return documentSubjectReference
  **/

  public String getDocumentSubjectReference() {
    return documentSubjectReference;
  }

  public void setDocumentSubjectReference(String documentSubjectReference) {
    this.documentSubjectReference = documentSubjectReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracked location of the physical document master version and any copies 
   * @return documentLocation
  **/

  public String getDocumentLocation() {
    return documentLocation;
  }

  public void setDocumentLocation(String documentLocation) {
    this.documentLocation = documentLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the document (e.g. on-file, authenticated, archived) 
   * @return documentStatus
  **/

  public String getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(String documentStatus) {
    this.documentStatus = documentStatus;
  }


}

