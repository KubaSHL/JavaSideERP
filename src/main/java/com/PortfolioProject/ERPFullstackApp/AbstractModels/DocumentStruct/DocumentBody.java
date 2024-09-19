package com.PortfolioProject.ERPFullstackApp.AbstractModels.DocumentStruct;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DocumentBody {

    @Id
    @SequenceGenerator(
            name = "document_body_sequence",
            sequenceName = "document_body_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "document_body_sequence"
    )
    private Long docBodyId;
    private Long parentBodyId;
    private Double discount;
    @OneToMany(cascade = CascadeType.MERGE)
    List<DocumentPosition> documentPositionList;

    public DocumentBody() {
    }

    public DocumentBody(List<DocumentPosition> documentPositionList) {
        this.documentPositionList = documentPositionList;
    }

    public Long getBodyId() {
        return docBodyId;
    }

    private void setBodyId(Long bodyId) {
        this.docBodyId = bodyId;
    }

    public Long getParentBodyId() {
        return parentBodyId;
    }

    public void setParentBodyId(Long parentBodyId) {
        this.parentBodyId = parentBodyId;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
