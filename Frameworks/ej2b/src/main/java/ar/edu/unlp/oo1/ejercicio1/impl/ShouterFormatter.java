package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class ShouterFormatter extends SimpleFormatter {
    public String format(final LogRecord record) { return super.format(record).toUpperCase(); }
}
