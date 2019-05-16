package Server;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import technology.tabula.Page;

import java.io.IOException;

@CrossOrigin
@RestController
public class PDFController {
    @RequestMapping("/PDFToJson")
    public PDFContent PDFToJson(@RequestParam(value="url") String url) {
        PDFService pdfs = new PDFService();
        try {
            return pdfs.PDFToJson(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
