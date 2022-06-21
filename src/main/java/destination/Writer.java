package destination;

import model.Document;
import statistic.StatisticResult;

import java.util.List;

public interface Writer {

    /**
     * Метод для сохранения данных
     * @param documentList список объектов для записи
     * @return сохранение результатов
     */

    WriterResult save(List<Document> documentList);
}
