/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
 
public class Templates {
     
    public static void main(String[] args) {
         
        //Freemarker configuration object
        Configuration cfg = new Configuration();
        try {
            //Load template from source folder
            Template template = cfg.getTemplate("src/pasaporte001.ftl");
             
            // Build the data-model
            Map<String, Object> data = new HashMap<String, Object>();

            data.put("nombre","Dalton Martinez");
            data.put("cedula","1.234.567-8");
            data.put("grado","3");
            data.put("taller","RLS 18 de Julio de 1830 #11");
            data.put("oriente","San José");
            data.put("carta","567/16");
            data.put("vence","07/18");

 
            //List parsing 
            List<String> countries = new ArrayList<String>();
            countries.add("India");
            countries.add("United States");
            countries.add("Germany");
            countries.add("France");
             
            data.put("countries", countries);
 
             
            // Console output
            Writer out = new OutputStreamWriter(System.out);
            template.process(data, out);
            out.flush();
 
            // File output
            Writer file = new FileWriter (new File("src/pasaporte001.svg"));
            template.process(data, file);
            file.flush();
            file.close();
             
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}

