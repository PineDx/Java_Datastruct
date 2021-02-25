package algorithm.design.behavior.TemplatePattern.platform;

import algorithm.design.behavior.TemplatePattern.MainMail;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 阿里邮箱
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/25-22:41
 */
public class AliMail extends MainMail {

    public AliMail(String account, String pwd) {
        super(account, pwd);
    }

    @Override
    protected Map<String, Object> uploadFile(Map<String, Object> context, Boolean upload) {
        context.put("upload", upload);
        return context;
    }

    @Override
    protected Map<String, Object> writeContext(String text) {
        Map<String , Object> context = new HashMap<>(2  );
        context.put("阿里邮箱内容",text);
        return context;
    }

    @Override
    protected boolean checkAccount(String account, String pwd) {
        if (account.equals("songlin") && pwd.equals("123")) {
            return true;
        }
        return false;
    }
}
