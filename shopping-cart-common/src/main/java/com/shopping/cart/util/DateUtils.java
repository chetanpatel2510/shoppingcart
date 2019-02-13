package com.shopping.cart.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class DateUtils {

	/**
	 * This method will convert the Date to String with given format.
	 * 
	 * If format is null, then it will default to yyyy-MM-dd
	 * 
	 * @param date
	 *            date object
	 * @param format
	 *            format in which date need to be converted.
	 * @return String version of the date.
	 */
	public static String convertDateToString(final Date date, final String format) {
		String dateFormat = format;
		if (StringUtils.isEmpty(format)) {
			dateFormat = ShoppingCartConstants.DATE_FORMAT_YYYY_MM_DD;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
}
