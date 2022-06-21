package log;

public interface Logger {
    /**
     * Метод для обработки ошибок
     * @param str строка с ошибкой
     */
    void info(String str);

    void error(String str, Exception e);
}
