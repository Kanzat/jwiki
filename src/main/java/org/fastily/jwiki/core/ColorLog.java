package org.fastily.jwiki.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.format.DateTimeFormatter;

/**
 * Colors a String and logs it to console. Your terminal must support ASCII escapes for this to work, otherwise the text
 * will not be colored.
 * 
 * @author Fastily
 *
 */
class ColorLog
{
	private static final Logger logger = LoggerFactory.getLogger(ColorLog.class);

	/**
	 * The date formatter prefixing output.
	 */
	private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a");

	/**
	 * Flag indicating whether logging with this object is allowed.
	 */
	protected boolean enabled;

	/**
	 * Constructor, creates a new ColorLog.
	 * 
	 * @param enableLogging Set true to allow this ColorLog to print log output.
	 */
	protected ColorLog(boolean enableLogging)
	{
		enabled = enableLogging;
	}

	/**
	 * Output warning message for wiki. Text is yellow.
	 * 
	 * @param wiki The wiki object to use
	 * @param s The String to print.
	 */
	protected void warn(Wiki wiki, String s)
	{
		if (enabled) {
			logger.warn(wiki + ": " + s);
		}
	}

	/**
	 * Output info message for wiki. Text is green.
	 * 
	 * @param wiki The wiki object to use
	 * @param s The String to print.
	 */
	protected void info(Wiki wiki, String s)
	{
		if (enabled) {
			logger.info(wiki + ": " + s);
		}
	}

	/**
	 * Output error message for wiki. Text is red.
	 * 
	 * @param wiki The wiki object to use
	 * @param s The String to print.
	 */
	protected void error(Wiki wiki, String s)
	{
		if (enabled) {
			logger.error(wiki + ": " + s);
		}
	}

	/**
	 * Output debug message for wiki. Text is purple.
	 * 
	 * @param wiki The wiki object to use
	 * @param s The String to print.
	 */
	protected void debug(Wiki wiki, String s)
	{
		if (enabled) {
			logger.debug(wiki + ": " + s);
		}
	}

	/**
	 * Output miscellaneous message for wiki. Text is blue.
	 * 
	 * @param wiki The wiki object to use
	 * @param s The String to print.
	 */
	protected void fyi(Wiki wiki, String s)
	{
		if (enabled) {
			logger.info(wiki + ": " + s);
		}
	}

}
