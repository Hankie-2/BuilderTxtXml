package kg.charginov.builder.builder;

import kg.charginov.builder.model.Article;

public class Director {

    ArticleBuilder builder;

    public void setBuilder(ArticleBuilder builder) {
        this.builder = builder;
    }

    public Article buildArticle(){
        builder.createArticle();
        builder.buildName();
        builder.buildHash();
        builder.buildText();
        builder.buildAuthors();
        builder.buildType();
        return builder.getArticle();
    }
}
