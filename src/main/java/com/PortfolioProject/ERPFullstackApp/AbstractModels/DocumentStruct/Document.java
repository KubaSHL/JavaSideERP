package com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Document {

    @Id
    @SequenceGenerator(
            name = "document_sequence",
            sequenceName = "document_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_sequence"
    )
    private Long mainId;

    @OneToOne(cascade = CascadeType.ALL)
    private DocumentMetaData documentMetaData;
    @OneToOne(cascade = CascadeType.ALL)
    private DocumentHeader documentHeader;
    @OneToOne(cascade = CascadeType.ALL)
    private DocumentBody documentBody;

    public Document() {
    }

    public Document(DocumentMetaData documentMetaData, DocumentHeader documentHeader, DocumentBody documentBody) {
        this.documentMetaData = documentMetaData;
        this.documentHeader = documentHeader;
        this.documentBody = documentBody;
    }

    public Long getMainId() {
        return mainId;
    }

    private void setMainId(Long mainId) {
        this.mainId = mainId;
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

