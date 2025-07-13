package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler {
    private Handler handler;
    private List<String> filteredWords;

    public FilterHandler(Handler handler) {
        this.handler = handler;
        filteredWords = new ArrayList<String>();
    }

    @Override
    public void publish(LogRecord record) {
        String[] words = record.getMessage().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (filteredWords.contains(words[i])) {
                words[i] = "***";
            }
        }

        this.handler.publish(record);
    }

    @Override
    public void flush() { this.handler.flush(); }
    @Override
    public void close() throws SecurityException { this.handler.close(); }
}
