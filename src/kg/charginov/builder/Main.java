package kg.charginov.builder;

import kg.charginov.builder.builder.Director;
import kg.charginov.builder.builder.TxtFileBuilder;
import kg.charginov.builder.model.Article;
import kg.charginov.builder.service.FileService;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new TxtFileBuilder());
        Article article = director.buildArticle();

        System.out.println(article);

        FileService service = new FileService();

        service.convertTxtToXml(article);

        System.out.println(article);

    }
}
