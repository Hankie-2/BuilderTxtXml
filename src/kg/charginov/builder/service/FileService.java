package kg.charginov.builder.service;

import kg.charginov.builder.builder.TxtFileBuilder;
import kg.charginov.builder.model.Article;
import kg.charginov.builder.model.FileType;

public class FileService {

    public void convertTxtToXml(Article article){
        article.setType(FileType.XML);
    }

}
