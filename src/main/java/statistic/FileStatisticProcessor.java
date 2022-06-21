package statistic;

import log.FileLogger;
import log.Logger;
import model.Document;

import java.util.List;

public class FileStatisticProcessor implements StatisticProcessor{

    private final static Logger LOGGER = new FileLogger();
    @Override
    public StatisticResult calculaterStatistic(List<Document> documentList) {


        LOGGER.info("расчет статистики запущен");

        try {

        } catch (Exception e) {
            LOGGER.info("ошибка");
        }

        StatisticResult result = null;

        LOGGER.info("расчет статистики завершен");



        return result;
    }
}
