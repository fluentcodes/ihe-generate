package org.fluentcodes.ihe.ebrs.metafields;


import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryError;

import java.util.ArrayList;
import java.util.List;

public class ErrorListWrapper {

    public enum SEVERITY {
        ERROR("urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Error"),
        WARNING("urn:oasis:names:tc:ebxml-regrep:ErrorSeverityType:Warning");
        private String text;
        SEVERITY(final String text){
            this.text = text;
        }
    }

    private List<RegistryError> errorList;

    public ErrorListWrapper() {
        errorList = new ArrayList<>();
    }

    public void addError(final String message, final String severity, final String code, final String codeContext ) {
        RegistryError error = new RegistryError();
        error.setValue(message);
        error.setSeverity(severity);
        error.setErrorCode(code);
        error.setCodeContext(codeContext);
        errorList.add(error);
    }

    public void addError(final String message) {
        RegistryError error = new RegistryError();
        error.setValue(message);
        errorList.add(error);
    }

    public void resetErrorList() {
        errorList = new ArrayList<>();
    }

    public List<RegistryError> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<RegistryError> errorList) {
        this.errorList = errorList;
    }

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }
}
