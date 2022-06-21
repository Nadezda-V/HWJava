package source;

import model.Document;

import java.util.List;

public interface DataCrawler {
    /**
     * Метод для сбора данных
     * @return данные
     */

    List<Document> fetchDocument();
}
