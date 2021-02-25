package algorithm.design.behavior.TemplatePattern;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * Title: 模板方法核心主类
 * Desc: 模拟发送邮件
 *
 * @Author: Songlin
 * @create: 2021/2/25-22:26
 */
public abstract class MainMail {
    String account;
    String pwd;

    public MainMail(String account, String pwd) {
        this.account = account;
        this.pwd = pwd;
    }

    /**
     * 发送一封封装好的邮件
     */
    public Boolean sendEmail(String emailAddress, String text, Boolean upload) {
        // 打开邮箱，验证登陆
        if (!checkAccount(account, pwd)) {
            System.out.println("账户错误");
            return null;
        }
        // 写入内容
        Map<String, Object> context = writeContext(text);
        // 上传附件
        if (upload) {
            // 有附件就上传，没附件直接发送
            context = uploadFile(context, upload);
        }

        // 发送邮件
        return this.send(context);
    }

    protected  Boolean send(Map<String, Object> email){
        System.out.println("模拟邮件发送，并成功发送");
        return true;
    };

    protected abstract Map<String, Object> uploadFile(Map<String, Object> context, Boolean upload);

    protected abstract Map<String, Object> writeContext(String text);

    protected abstract boolean checkAccount(String account, String pwd);
}
