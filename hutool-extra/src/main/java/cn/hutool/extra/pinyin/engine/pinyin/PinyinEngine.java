package cn.hutool.extra.pinyin.engine.pinyin;

import com.github.houbb.pinyin.constant.enums.PinyinStyleEnum;
import com.github.houbb.pinyin.util.PinyinHelper;

/**
 * 封装了 Pinyin 的引擎。
 *
 * <p>
 * pinyin(https://github.com/houbb/pinyin)封装。
 * </p>
 *
 * <p>
 * 引入：
 * <pre>
 * &lt;dependency&gt;
 *     &lt;groupId&gt;com.github.houbb&lt;/groupId&gt;
 *     &lt;artifactId&gt;pinyin&lt;/artifactId&gt;
 *     &lt;version&gt;0.2.0&lt;/version&gt;
 * &lt;/dependency&gt;
 * </pre>
 *
 * @author looly
 */
public class PinyinEngine implements cn.hutool.extra.pinyin.PinyinEngine {

	/**
	 * 汉字拼音输出的格式
	 */
	PinyinStyleEnum format;

	/**
	 * 构造
	 */
	public PinyinEngine() {
		this(null);
	}

	/**
	 * 构造
	 *
	 * @param format 格式
	 */
	public PinyinEngine(PinyinStyleEnum format) {
		init(format);
	}

	/**
	 * 初始化
	 *
	 * @param format 格式
	 */
	public void init(PinyinStyleEnum format) {
		if (null == format) {
			format = PinyinStyleEnum.NORMAL;
		}
		this.format = format;
	}

	@Override
	public String getPinyin(char c) {
		String result;
		result = PinyinHelper.toPinyin(String.valueOf(c), format);
		return result;
	}

	@Override
	public String getPinyin(String str, String separator) {
		String result;
		result = PinyinHelper.toPinyin(str, format);
		return result;
	}
}
