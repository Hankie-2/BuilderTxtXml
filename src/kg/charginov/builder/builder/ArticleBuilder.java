package kg.charginov.builder.builder;

import kg.charginov.builder.model.Article;

public abstract class ArticleBuilder {

    private Article article;

    public void createArticle(){
        article = new Article();
    }

    abstract void buildName();
    abstract void buildAuthors();
    abstract void buildText();
    abstract void buildHash();
    abstract void buildType();

    public Article getArticle(){
        return this.article;
    }
}
