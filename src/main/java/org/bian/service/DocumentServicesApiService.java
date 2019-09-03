/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DocumentServicesApiService {

	SDDocumentServicesActivateOutputModel activate(SDDocumentServicesActivateInputModel request);
	
	SDDocumentServicesConfigureOutputModel configure(String sdReferenceId, SDDocumentServicesConfigureInputModel request);
	
	CRDocumentDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryControlInputModel request);
	
	CRDocumentDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryExchangeInputModel request);
	
	SDDocumentServicesFeedbackOutputModel feedback(String sdReferenceId, SDDocumentServicesFeedbackInputModel request);
	
	CRDocumentDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRDocumentDirectoryEntryRegisterInputModel request);
	
	CRDocumentDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryRequestInputModel request);
	
	CRDocumentDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDDocumentServicesRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDocumentDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryUpdateInputModel request);
	
}
