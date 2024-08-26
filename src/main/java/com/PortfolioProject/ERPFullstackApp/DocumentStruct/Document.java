package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import jakarta.persistence.OneToOne;

import java.util.List;

public abstract class Document {
    @OneToOne
    DocumentMetaData documentMetaData;
    @OneToOne
    DocumentHeader documentHeader;
    @OneToOne
    DocumentBody documentBody;

    public Document() {
    }

    public Document(DocumentMetaData documentMetaData, DocumentHeader documentHeader, DocumentBody documentBody) {
        this.documentMetaData = documentMetaData;
        this.documentHeader = documentHeader;
        this.documentBody = documentBody;
    }


    public DocumentMetaData getDocumentMetaData() {
        return documentMetaData;
    }

    public void setDocumentMetaData(DocumentMetaData documentMetaData) {
        this.documentMetaData = documentMetaData;
    }

    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    public void setDocumentHeader(DocumentHeader documentHeader) {
        this.documentHeader = documentHeader;
    }

    public DocumentBody getDocumentBody() {
        return documentBody;
    }

    public void setDocumentBody(DocumentBody documentBody) {
        this.documentBody = documentBody;
    }
}

