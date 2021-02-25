package Test.design;

import algorithm.design.behavior.TemplatePattern.MainMail;
import algorithm.design.behavior.TemplatePattern.platform.AliMail;
import algorithm.design.behavior.TemplatePattern.platform.QQMail;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/25-22:55
 */
public class TemplatePatternTest {
    public static void main(String[] args) {
        MainMail qqmail = new QQMail("4455665","132");
        qqmail.sendEmail("xxx@qq.com","这是qq的邮箱内容",false);

        MainMail alimail = new AliMail("songlin", "123");
        alimail.sendEmail("xxx@ali.com", "这是阿里邮箱内容", true);
    }
}
