package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

public abstract class DocumentMetaData {

    @SequenceGenerator(
            name = "document_sequence",
            sequenceName = "document_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_sequence"
    )
    private Long docId;
    DocumentTypeEnum type;
    String createdBy;

    public DocumentMetaData() {
    }

    public DocumentMetaData(DocumentTypeEnum type, String createdBy) {
        this.type = type;
        this.createdBy = createdBy;
    }

    public Long getDocId() {
        return docId;
    }

    private void setDocId(Long docId) {
        this.docId = docId;
    }

    public DocumentTypeEnum getType() {
        return type;
    }

    public void setType(DocumentTypeEnum type) {
        this.type = type;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
