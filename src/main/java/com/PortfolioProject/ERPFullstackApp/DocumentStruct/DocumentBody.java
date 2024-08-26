package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import java.util.List;

public abstract class DocumentBody {

    List<DocumentPosition> documentPositionList;

    public DocumentBody() {
    }

    public DocumentBody(List<DocumentPosition> documentPositionList) {
        this.documentPositionList = documentPositionList;
    }

    public List<DocumentPosition> getDocumentPositionList() {
        return documentPositionList;
    }

    public void setDocumentPositionList(List<DocumentPosition> documentPositionList) {
        this.documentPositionList = documentPositionList;
    }
}
