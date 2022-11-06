package kg.charginov.builder.builder;

import kg.charginov.builder.model.Article;
import kg.charginov.builder.model.FileType;

import java.util.List;

public class TxtFileBuilder extends ArticleBuilder{

    @Override
    void buildName() {
        getArticle().setTitle("Квантовая физика.");
    }

    @Override
    void buildAuthors() {
        getArticle().setAuthors(List.of("Стивен Хокинг","Альберт Эйнштейн"));
    }

    @Override
    void buildText() {
        getArticle().setText("Какой-то текст про физику.");
    }

    @Override
    void buildHash() {
        getArticle().setHash(getClass().hashCode());
    }

    @Override
    void buildType(){
        getArticle().setType(FileType.TXT);
    }

}
