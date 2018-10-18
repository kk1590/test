import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("abc")
    public String method01(){
        return "abc";
    }

    public void test(){

        System.out.println("测试");
    }


    public void test2(){

        System.out.println("测试2");
    }
}
