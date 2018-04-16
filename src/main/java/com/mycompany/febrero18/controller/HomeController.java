package com.mycompany.febrero18.controller;

import com.mycompany.febrero18.dao.CuotaDAO;
import com.mycompany.febrero18.modelos.Cuota;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    CuotaDAO cuotaDAO; 
    
        
	@RequestMapping(value={"/","Inicio"})
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
        
        
        @RequestMapping(value="/Insertar")
        public ModelAndView insertar(HttpServletResponse response)throws IOException{
                return new ModelAndView("insertar");
        }
        
        
        @RequestMapping(value="/EjecutarInsertar")
        public ModelAndView ejecutarinsertar(HttpServletResponse response,
                @RequestParam(value="cuota1")double cuota1,
                @RequestParam(value="cuota2")double cuota2,
                @RequestParam(value="cuota3")double cuota3,
                @RequestParam(value="cuota4")double cuota4
                )throws IOException{
            
            Cuota c=new Cuota(-1,cuota1,cuota2,cuota3,cuota4);
            cuotaDAO.insertar(c);
            return new ModelAndView("ejecutarinsertar");
            
        }
        
        

}
