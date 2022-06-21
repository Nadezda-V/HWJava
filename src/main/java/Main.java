package main.java;

import destination.FileWriter;
import destination.Writer;
import destination.WriterResult;
import model.Document;
import source.DataCrawler;
import source.FileDataCrewler;
import statistic.FileStatisticProcessor;
import statistic.StatisticProcessor;
import statistic.StatisticResult;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        boolean simple = false;
        if (args != null && args.length > 0) {
            String parameterZero = args[0];
            parameterZero = parameterZero.replaceAll("\\s+", "");
            simple = "-simple".equalsIgnoreCase(parameterZero);
        }

        model.Letter letter = new model.Letter(0, "Письмо в отдел кадров", "Вершининой Н.И.", "Жаворонок О.А.");
        model.DismissalOrder dismissalOrder = new model.DismissalOrder(1, "Приказ об увальнении Сотрудниковой Б.Б.", "Сотрудникова Б.Б.", "Приказываю уволить Сотрудникову Б.Б", "прогул");
        model.ReceptionOrder receptionOrder = new model.ReceptionOrder(2, "Приказ о приеме на работу Успешную Я.Я.", "Успешная Я.Я", "Приказываю принять на работу");
        letter.print(simple);
        dismissalOrder.print(simple);
        receptionOrder.print(simple);
        dismissalOrder.changeStatus();
        receptionOrder.changeStatus();
        dismissalOrder.print(simple);
        receptionOrder.print(simple);
        /**
         * Получение данных
         */
        DataCrawler source = new FileDataCrewler();
        List<Document> documentsList = source.fetchDocument();
        /**
         * Вычисление статистики
         */
        StatisticProcessor processor = new FileStatisticProcessor();
        StatisticResult result = processor.calculaterStatistic(documentsList);
        /**
         * Сохранение результата
         */
        Writer destination = new FileWriter();
        WriterResult result1 = destination.save(documentsList);



    }
}





