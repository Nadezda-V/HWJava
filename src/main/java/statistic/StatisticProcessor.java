package statistic;

import model.Document;

import java.util.List;

public interface StatisticProcessor {
    /**
     * Метод для вычисления статистики
     * @param documentList список документов
     * @return объект с вычисленной статистикой
     */

    StatisticResult calculaterStatistic(List<Document> documentList);
}
