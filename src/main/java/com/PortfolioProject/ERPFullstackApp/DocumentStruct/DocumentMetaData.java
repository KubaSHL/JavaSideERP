package com.PortfolioProject.ERPFullstackApp.DocumentStruct;

import com.PortfolioProject.ERPFullstackApp.DocumentStruct.Enums.DocumentTypeEnum;

public abstract class DocumentMetaData {
    Long docId;
    DocumentTypeEnum type;
    String createdBy;

}
