package com.jdan.fastreader.util;

import java.math.BigDecimal;

/**
 * 有关数学方面 MathUtils
 * 
 * @author Yn Data: 2017-4-28 下午5:33:13
 */
public class MathUtils {
	/**
	 * 得到结果
	 * 
	 * @param b
	 * @param newScale
	 * @return
	 */
	public static double getRes(double b, int newScale) {
		BigDecimal bd = new BigDecimal(b);
		BigDecimal scale = bd.setScale(newScale, BigDecimal.ROUND_HALF_UP);
		return scale.doubleValue();
	}

	// 格式:10个字符-10个数子从0~99随机排列 (中间用-分开)
	// Xds9ybOh5z-51_41_40_9_59_52_17_23_61_43
	// ID8fs2qEp6-57_5_39_7_40_31_2_54_20_15
	// fN8wsqfD0g-7_49_39_46_40_2_7_5_32_14
	public static String getRandomStr() {
		String[] arr_ = { "G", "T", "q", "j", "7", "D", "t", "f", "n", "9",
				"M", "c", "m", "B", "g", "6", "W", "O", "v", "U", "p", "1",
				"3", "h", "u", "V", "e", "L", "R", "A", "l", "2", "0", "F",
				"Z", "C", "H", "r", "P", "8", "s", "d", "Y", "z", "x", "Q",
				"w", "k", "J", "N", "a", "X", "b", "o", "E", "4", "K", "I",
				"S", "y", "i", "5" };
		String result = "";
		String key = "";
		String value = "";
		for (int i = 0; i < 10; i++) {
			int k = (int) Math.floor(arr_.length * Math.random());
			if ("".equals(value)) {
				value += k;
			} else {
				value += "_" + k;
			}
			key += arr_[k];
		}
		result = key + "-" + value;
		return result;
	}
}
