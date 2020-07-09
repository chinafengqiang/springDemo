import java.io.UnsupportedEncodingException;

/**
 * <p>
 *     字符串占用字节数测试
 *      char一定是两个字节吗?不是的，这个跟我们选用的字符编码有关，
 *      如果采用”ISO-8859-1”编码，那么一个char只会有一个字节。
 *      如果采用”UTF-8”或者“GB2312”、“GBK”等编码格式呢?这几种编码格式
 *      采用的是动态长度的，如果是英文字符，大家都是一个字节。如果是中文，
 *      ”UTF-8”是三个字节，而”GBK”和”GB2312”是两个字节。而对于”unicode”而言，
 *      无论如何都是两个字节。
 *      然后再回答第二个问题，对于一个char如果用”ISO-8859-1”来存储的话，
 *      肯定无法存储一个中文，而对于”UTF-8”、“GB2312”、“GBK”而言大多数中文字符
 *      是可以存储的。
 * </p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-29
 */
public class TestStr {
    public static void main(String[] args)throws UnsupportedEncodingException {
        String s1 = "1234567";// 7个数字字符
        byte[] b1 = s1.getBytes();
        System.out.println("7个数字字符1234567所占的字节数为:" + b1.length);
        String s2 = "abcdefg";// 7个英文字符
        byte[] b2 = s2.getBytes();
        System.out.println("7个英文字符abcdefg所占的字节数为:" + b2.length);
        String s3 = "::<>{}?";// 7个英文符号字符
        byte[] b3 = s3.getBytes();
        System.out.println("7个英文符号字符::<>{}?所占的字节数为:" + b3.length);
        String s4 = "钓鱼岛是中国的";// 7个中文汉字字符
        byte[] b4 = s4.getBytes();
        System.out.println("钓鱼岛是中国的所占的字节数为:" + b4.length);
    }
}

