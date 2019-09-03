/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DocumentServicesApiServiceImpl implements DocumentServicesApiService {

	public SDDocumentServicesActivateOutputModel activate(SDDocumentServicesActivateInputModel request){
		return JsonReader.read("activate-SDDocumentServicesActivateOutputModel.json",new TypeReference<SDDocumentServicesActivateOutputModel>(){});
	}
	
	public SDDocumentServicesConfigureOutputModel configure(String sdReferenceId, SDDocumentServicesConfigureInputModel request){
		return JsonReader.read("configure-SDDocumentServicesConfigureOutputModel.json",new TypeReference<SDDocumentServicesConfigureOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRDocumentDirectoryEntryControlOutputModel.json",new TypeReference<CRDocumentDirectoryEntryControlOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryExchangeInputModel request){
		return JsonReader.read("exchange-CRDocumentDirectoryEntryExchangeOutputModel.json",new TypeReference<CRDocumentDirectoryEntryExchangeOutputModel>(){});
	}
	
	public SDDocumentServicesFeedbackOutputModel feedback(String sdReferenceId, SDDocumentServicesFeedbackInputModel request){
		return JsonReader.read("feedback-SDDocumentServicesFeedbackOutputModel.json",new TypeReference<SDDocumentServicesFeedbackOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRDocumentDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRDocumentDirectoryEntryRegisterOutputModel.json",new TypeReference<CRDocumentDirectoryEntryRegisterOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRDocumentDirectoryEntryRequestOutputModel.json",new TypeReference<CRDocumentDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDocumentDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRDocumentDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDDocumentServicesRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDocumentServicesRetrieveOutputModel.json",new TypeReference<SDDocumentServicesRetrieveOutputModel>(){});
	}
	
	public CRDocumentDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDocumentDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRDocumentDirectoryEntryUpdateOutputModel.json",new TypeReference<CRDocumentDirectoryEntryUpdateOutputModel>(){});
	}
	
}
