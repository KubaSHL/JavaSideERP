package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DocumentMetaData {

    @Id
    @SequenceGenerator(
            name = "document_meta_sequence",
            sequenceName = "document_meta_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_meta_sequence"
    )
    private Long metaDocId;
    DocumentTypeEnum type;
    String createdBy;

    public DocumentMetaData() {
    }

    public DocumentMetaData(DocumentTypeEnum type, String createdBy) {
        this.type = type;
        this.createdBy = createdBy;
    }

    public Long getDocId() {
        return metaDocId;
    }

    private void setDocId(Long docId) {
        this.metaDocId = docId;
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
